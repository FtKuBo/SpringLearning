package com.mehdi.UserProfileApi.infra;

import java.util.UUID;

public class UserProfile {
    private UUID id;
    private String name;
    private String email;

    public UserProfile(String name, String email){
        this.id=UUID.randomUUID();
        this.name=name;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
