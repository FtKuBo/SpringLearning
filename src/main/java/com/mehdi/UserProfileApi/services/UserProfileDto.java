package com.mehdi.UserProfileApi.services;


import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

public class UserProfileDto {
    public UUID id;
    public String name;
    public String email;
}
