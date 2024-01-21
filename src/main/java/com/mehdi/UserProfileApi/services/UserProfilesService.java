package com.mehdi.UserProfileApi.services;


import com.mehdi.UserProfileApi.infra.UserProfileRepository;

public class UserProfilesService {
    private UserProfileRepository UserProfileRepository;

    public UserProfilesService(){
        UserProfileRepository = new UserProfileRepository();
    }
    public UserProfileDto createProfile(CreateUserPorfileDto Dto){
        return new UserProfileDto();
    }

    private UserProfile toUserProfile(CreateUserProfileDto dto){
        return new UserProfile();
    }
}
