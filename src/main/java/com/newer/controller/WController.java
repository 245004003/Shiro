package com.newer.controller;

import com.newer.domain.Sessions;
import com.newer.domain.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 * Create by 何辉
 * 2020/3/28 11:22
 */
@RestController
@SessionAttributes(Sessions.SESSION_LOGIN_USER)
public class WController {
    @GetMapping("/a")
    public User hello1(ModelMap modelMap){

        User user=(User) modelMap.get(Sessions.SESSION_LOGIN_USER);
        return user;
    }



}
