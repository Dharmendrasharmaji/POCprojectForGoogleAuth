package com.poc.project.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    private String user_name;
    private String user_pic_url;
    private String email;

    @GetMapping("/")
    public String showHome(@AuthenticationPrincipal OAuth2User oAuth2User, Model model){
//        oAuth2User helps to get login details but not password
        user_name = oAuth2User.getAttribute("name").toString();
        user_pic_url = oAuth2User.getAttribute("picture").toString();
        email = oAuth2User.getAttribute("email").toString();
//        Model helps to write JSP file
        model.addAttribute("user_pic_url",user_pic_url);
        model.addAttribute("name",user_name);
        model.addAttribute("email",email);
        return "index";
    }

}
