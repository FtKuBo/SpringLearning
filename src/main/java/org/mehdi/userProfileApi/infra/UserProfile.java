package org.mehdi.userProfileApi.infra;

import java.util.UUID;

public class UserProfile {
    private UUID id;
    private String name;
    private String email;

    public UserProfile(String name, String email){
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }

    public UserProfile(UUID id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
