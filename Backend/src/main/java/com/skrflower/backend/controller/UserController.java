package com.skrflower.backend.controller;

import com.skrflower.backend.bean.User;
import com.skrflower.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public Map<String,Object> register(User user){
        Map<String, Object> map = new HashMap<>();
        if (userService.findByUsername(user.getUsername()) != null){
            map.put("fail","用户名已被占用！");
        }else {
            userService.addUser(user);
            map.put("success","注册成功！");
        }
        return map;
    }

    @PostMapping("/login")
    public Map<String,Object> login(String username,String password,HttpSession session){
        Map<String, Object> map = new HashMap<>();
        if (userService.isUser(username,password)){
            User user = userService.findByNameAndPwd(username,password);
            //使用session记住登录状态
            session.setAttribute("user",user);
            map.put("success","登录成功！");
        }else {
            map.put("fail","用户名或密码错误！");
        }
        return map;
    }

    @PostMapping("/exit")
    public void exit(HttpSession session){
        //将session设置为失效
        session.invalidate();
    }

    @PostMapping("/update")
    public Map<String,Object> update(User user){
        Map<String, Object> map = new HashMap<>();
        userService.updateUser(user);
        map.put("success","修改成功！");
        return map;
    }
}
