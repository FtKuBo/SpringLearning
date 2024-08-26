package org.mehdi.userProfileApi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public WelcomeDto getHome(){
        return new WelcomeDto();
    }
}
