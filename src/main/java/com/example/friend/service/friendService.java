package com.example.friend.service;

import com.example.friend.model.friend;
import com.example.friend.repository.friendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class friendService {
    @Autowired
    private friendRepository friendsRepository;

    public List<friend> getAllFriendsList() {
        return friendsRepository.getAllFriendsList();
    }

    public friend addFriend(friend friendd) {
        return friendsRepository.addFriend(friendd);
    }

    public friend getFriendByName(String name) {
        return friendsRepository.getByName(name);
    }

    public boolean deleteFriendByName(String name) {
        return friendsRepository.deleteByName(name);
    }

    public boolean updateFriendByName(String name, friend updatedFriend) {
        return friendsRepository.updateByName(name, updatedFriend);
    }

    public boolean patchFriendByName(String name, friend partialFriend) {
        return friendsRepository.patchByName(name, partialFriend);
    }
}
