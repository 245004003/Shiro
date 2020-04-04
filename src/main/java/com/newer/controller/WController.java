package com.newer.controller;

import com.newer.util.Sessions;
import com.newer.domain.User;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${shiro.unauthorizedUrl}")
    private String UnauthorizedUrl;
    @GetMapping("/a")
    public void hello1(ModelMap modelMap){

        System.out.println(UnauthorizedUrl);
    }



}
