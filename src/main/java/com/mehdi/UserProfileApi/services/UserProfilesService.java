package com.mehdi.UserProfileApi.services;

import com.mehdi.UserProfileApi.infra.UserProfile;
import com.mehdi.UserProfileApi.infra.UserProfileRepository;
import org.apache.catalina.User;

public class UserProfilesService {
    private UserProfileRepository UserProfileRepository;

    public UserProfilesService(){

        UserProfileRepository = new UserProfileRepository();
    }
    public UserProfileDto createProfile(CreateUserPorfileDto Dto){
        UserProfile userProfile = toUserProfile(Dto);
        UserProfileRepository.save(userProfile);

        return toDto(userProfile);
    }

    private UserProfile toUserProfile(CreateUserPorfileDto dto){
        return new UserProfile(dto.name,dto.email);
    }

    private UserProfileDto toDto(UserProfile userProfile){
        UserProfileDto dto = new UserProfileDto();
        dto.email = userProfile.getEmail();
        dto.id = userProfile.getId();
        dto.name = userProfile.getName();

        return dto;
    }
}
