package com.skrflower.backend.controller;

import com.skrflower.backend.bean.User;
import com.skrflower.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public Map<String,Object> register(User user){
        Map<String, Object> map = new HashMap<>();
        userService.addUser(user);
        map.put("user",user);
        return map;
    }

    @PostMapping("/login")
    public void login(String username,String password,HttpSession session){
        if (userService.isUser(username,password)){
            User user = userService.findByNameAndPwd(username,password);
            //使用session记住登录状态
            session.setAttribute("user",user);
        }else {
            return;
        }
    }

    @PostMapping("/exit")
    public void exit(HttpSession session){
        //将session设置为失效
        session.invalidate();
        return;
    }
}
