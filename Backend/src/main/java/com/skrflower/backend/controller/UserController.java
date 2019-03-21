package com.skrflower.backend.controller;

import com.skrflower.backend.bean.User;
import com.skrflower.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public Map<String,Object> getUser(){
        User user = userService.findByUsername("tom");
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        return map;
    }
}
