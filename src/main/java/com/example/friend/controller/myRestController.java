package com.example.friend.controller;

import com.example.friend.model.friend;
import com.example.friend.service.friendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class myRestController {
    @Autowired
    private friendService friendservice;
    @GetMapping("/all")
    public List<friend> getAllFriends() {
        return friendservice.getAllFriendsList();
    }

    @PostMapping("/add")
    public friend addFriend(@RequestBody friend friendd) {
        return friendservice.addFriend(friendd);
    }

    @GetMapping("/get/{name}")
    public friend getFriendByName(@PathVariable String name) {
        return friendservice.getFriendByName(name);
    }

    @DeleteMapping("/delete/{name}")
    public boolean deleteFriend(@PathVariable String name) {
        return friendservice.deleteFriendByName(name);
    }

    @PutMapping("/update/{name}")
    public boolean updateFriend(@PathVariable String name, @RequestBody friend updatedFriend) {
        return friendservice.updateFriendByName(name, updatedFriend);
    }

    @PatchMapping("/patch/{name}")
    public boolean patchFriend(@PathVariable String name, @RequestBody friend partialFriend) {
        return friendservice.patchFriendByName(name, partialFriend);
    }
}
