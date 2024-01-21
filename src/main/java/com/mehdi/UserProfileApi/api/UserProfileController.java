package com.mehdi.UserProfileApi.api;

import com.mehdi.UserProfileApi.services.CreateUserPorfileDto;
import com.mehdi.UserProfileApi.services.UserProfileDto;
import com.mehdi.UserProfileApi.services.UserProfilesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {
    private UserProfilesService UserProfileService;

    public UserProfileController(){
        UserProfileService = new UserProfilesService();
    }
    @PostMapping("/profiles")
    public UserProfileDto postProfile(@RequestBody CreateUserPorfileDto Dto) {
        return UserProfileService.createProfile(Dto);
    }
}