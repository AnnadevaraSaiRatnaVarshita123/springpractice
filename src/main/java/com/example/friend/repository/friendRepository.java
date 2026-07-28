package com.example.friend.repository;

import com.example.friend.model.friend;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class friendRepository {
    private List<friend> friends = new ArrayList<>(List.of(
        new friend("Alice", "New York", 25),
        new friend("Bob", "Los Angeles", 30),
        new friend("Charlie", "Chicago", 35)
    ));
    public List<friend> getAllFriendsList() {
        return friends;
    }
    public friend addFriend(friend friendd) {
        friends.add(friendd);
        return friendd;
    }

    public friend getByName(String name) {
        return friends.stream()
            .filter(f -> f.getName() != null && f.getName().equalsIgnoreCase(name))
            .findFirst()
            .orElse(null);
    }

    public boolean deleteByName(String name) {
        return friends.removeIf(f -> f.getName() != null && f.getName().equalsIgnoreCase(name));
    }

    public boolean updateByName(String name, friend updatedFriend) {
        for (friend f : friends) {
            if (f.getName() != null && f.getName().equalsIgnoreCase(name)) {
                f.setName(updatedFriend.getName());
                f.setCity(updatedFriend.getCity());
                f.setAge(updatedFriend.getAge());
                return true;
            }
        }
        return false;
    }

    public boolean patchByName(String name, friend partialFriend) {
        for (friend f : friends) {
            if (f.getName() != null && f.getName().equalsIgnoreCase(name)) {
                // Only update fields that are provided (not null)
                if (partialFriend.getName() != null) f.setName(partialFriend.getName());
                if (partialFriend.getCity() != null) f.setCity(partialFriend.getCity());
                if (partialFriend.getAge()  != null) f.setAge(partialFriend.getAge());
                return true;
            }
        }
        return false;
    }
}
