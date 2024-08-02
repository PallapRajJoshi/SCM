package com.smart_content_manager.content_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        //sending data to view html page
        model.addAttribute("name", "Pallap Raj Joshi");
        model.addAttribute("github_profile", "https://github.com/PallapRajJoshi");
        return "home";
    }

    @GetMapping("/about")
    public String about() {

        return "about";
    }

    @GetMapping("/services")
    public String services() {

        return "services";
    }


    @GetMapping("/contact")
    public String contact() {

        return "contact";
    }


    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/signup")
    public String signup() {

        return "register";
    }

}
