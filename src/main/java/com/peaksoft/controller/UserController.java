package com.peaksoft.controller;

import com.peaksoft.model.User;
import com.peaksoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
   @Autowired
    private UserService userService;

    @GetMapping
    public String listUsers(Model model){
        List<User> userList = userService.listUsers();
        model.addAttribute("listUser",userList);
        return "users";
    }





}
