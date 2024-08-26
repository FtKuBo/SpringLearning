package org.mehdi.userProfileApi.api;

import jakarta.websocket.server.PathParam;
import org.apache.catalina.User;
import org.mehdi.userProfileApi.infra.UserProfile;
import org.mehdi.userProfileApi.service.CreateUserProfileDto;
import org.mehdi.userProfileApi.service.UserProfileDto;
import org.mehdi.userProfileApi.service.UserProfileService;
import org.mehdi.userProfileApi.service.UserProfilesDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UserProfileController {

    private UserProfileService userProfileService;

    public UserProfileController(){
        userProfileService = new UserProfileService();
    }
    @PostMapping("/profiles")
    public UserProfileDto postProfile(@RequestBody CreateUserProfileDto dto){
        return userProfileService.CreateProfile(dto);
    }

    @GetMapping("/profiles")
    public UserProfilesDto getProfiles(){
        return userProfileService.getAllProfiles();
    }

    @GetMapping("/profiles/{id}")
    public UserProfileDto getProfile(@PathVariable("id") UUID id){
        return userProfileService.getProfile(id);
    }

    @PutMapping("/profiles/{id}")
    public UserProfileDto putProfile(@PathVariable("id") UUID id, @RequestBody CreateUserProfileDto dto){
        UserProfileDto userProfileDto = new UserProfileDto();
        userProfileDto.id = id;
        userProfileDto.name = dto.name;
        userProfileDto.email = dto.email;
        return userProfileService.updateProfile(userProfileDto);
    }

    @DeleteMapping("/profiles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@PathVariable("id") UUID id){
        userProfileService.deleteProfile(id);
    }
}

