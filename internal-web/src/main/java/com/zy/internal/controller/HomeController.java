package com.zy.internal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangyanyan on 2017/6/24.
 */
@Controller
@RequestMapping({"/home"})
public class HomeController {
    @GetMapping
    @PostMapping
    public String home() {
        return "home";
    }
}
