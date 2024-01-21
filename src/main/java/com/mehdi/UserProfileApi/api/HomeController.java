package com.mehdi.UserProfileApi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public WelcomeDto getHome(){
        WelcomeDto wlcDto = new WelcomeDto();
        wlcDto.status = "green";
        wlcDto.welcomeMessage="welcome to the btfl vancouver";
        return wlcDto;
    }

}
