package com.mamastep.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/")
    public String root() {
        return "login";
    }

    @PostMapping("/login")
    public String post() { return "redirect:/home"; }

    @GetMapping("/home")
    public String dashboard() {
        return "home";
    }
}
