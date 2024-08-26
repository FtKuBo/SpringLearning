package org.mehdi.userProfileApi.service;

import org.mehdi.userProfileApi.infra.UserProfile;
import org.mehdi.userProfileApi.infra.UserProfileRepository;

import java.util.*;

public class UserProfileService {
    private UserProfileRepository userProfileRepository;

    public UserProfileService(){
        this.userProfileRepository = new UserProfileRepository();
    }
    public UserProfileDto CreateProfile(CreateUserProfileDto dto){
        UserProfile userProfile = toUserProfile(dto);
        userProfileRepository.save(userProfile);
        return toUserProfileDto(userProfile);
    }

    public UserProfilesDto getAllProfiles(){
        List<UserProfileDto> profiles = userProfileRepository.findAll().stream().map(this::toUserProfileDto).toList();
        UserProfilesDto userProfilesDto = new UserProfilesDto();
        userProfilesDto.profiles = profiles;
        return userProfilesDto;
    }

    public UserProfileDto getProfile(UUID id){
        UserProfile foundProfile = userProfileRepository.find(id);
        return toUserProfileDto(foundProfile);
    }

    public UserProfileDto updateProfile(UserProfileDto dto){
        if(userProfileRepository.find(dto.id) == null){
            throw new RuntimeException(String.format("Profile with id {%s} not found",dto.id));
        }
        UserProfile userProfile = toUserProfile(dto);
        userProfileRepository.save(userProfile);

        return dto;
    }

    public void deleteProfile(UUID id){
        userProfileRepository.delete(id);
    }

    private UserProfile toUserProfile(CreateUserProfileDto dto){
        return new UserProfile(dto.name, dto.email);
    }

    private UserProfile toUserProfile(UserProfileDto dto){
        return new UserProfile(dto.id, dto.name, dto.email);
    }

    private UserProfileDto toUserProfileDto(UserProfile userProfile){
        UserProfileDto dto = new UserProfileDto();
        dto.id = userProfile.getId();
        dto.name = userProfile.getName();
        dto.email = userProfile.getEmail();

        return dto;
    }
}
