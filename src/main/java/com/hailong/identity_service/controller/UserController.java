package com.hailong.identity_service.controller;

import com.hailong.identity_service.dto.request.UserCreationRequest;
import com.hailong.identity_service.dto.request.UserUpdateRequest;
import com.hailong.identity_service.entity.User;
import com.hailong.identity_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createRequest(request);
    }

    @GetMapping
    List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/{userId}")
        User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "user has been deleted";
    }
}
