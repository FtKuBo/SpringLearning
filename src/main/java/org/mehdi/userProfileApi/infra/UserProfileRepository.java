package org.mehdi.userProfileApi.infra;

import java.util.*;

public class UserProfileRepository {
    private static final Map<UUID, UserProfile> profiles = new HashMap<>();

    public void save(UserProfile userProfile){
        profiles.put(userProfile.getId(),userProfile);
    }

    public List<UserProfile> findAll(){
        return new ArrayList<>(profiles.values());
    }
    public UserProfile find(UUID id){
        return profiles.get(id);
    }

    public void delete(UUID id){
        profiles.remove(id);
    }
}
