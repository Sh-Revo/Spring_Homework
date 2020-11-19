package com.spring.homework.controller;

import com.spring.homework.domain.User;
import com.spring.homework.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/updateAndInsert")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @PostMapping("/delete")
    public void deleteUser(@RequestBody User user){
        userService.deleteUser(user);
    }
}
