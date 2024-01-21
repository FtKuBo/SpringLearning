package com.mehdi.UserProfileApi.infra;

import org.apache.catalina.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserProfileRepository {
    private static final Map<UUID, UserProfile> profiles = new HashMap<>();

    public void save(UserProfile profile){
        profiles.put(profile.getId(),profile);
    }

    public UserProfile get(UUID uuid){
        return profiles.get(uuid);
    }
}
