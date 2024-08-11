package com.smart_content_manager.content_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smart_content_manager.content_manager.helpers.Message;
import com.smart_content_manager.content_manager.helpers.MessageType;
import com.smart_content_manager.content_manager.model.User;
import com.smart_content_manager.content_manager.model.UserRegister;
import com.smart_content_manager.content_manager.services.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class PageController {

@Autowired
private UserService userService;



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
    public String signup(Model model) {

        UserRegister userForm=new UserRegister();
userForm.setName("pallap");
userForm.setAbout(" welcome to about this application");
        model.addAttribute("userForm", userForm);

        return "register";
    }


//processing registered services
@RequestMapping(value="/do-register", method=RequestMethod.POST)

public String processRequest(@ModelAttribute UserRegister user ,HttpSession session) {
//fetch data from form


//validate 


//save to database
// User user1=User.builder()
// .name(user.getName())
// .email(user.getEmail())
// .password(user.getPassword())
// .about(user.getAbout())
// .phoneNumber(user.getPhoneNumber())
// .profilePic("https://static.vecteezy.com/system/resources/thumbnails/010/260/479/small/default-avatar-profile-icon-of-social-media-user-in-clipart-style-vector.jpg")
// .build();

User user1=new User();
user1.setName(user.getName());
user1.setEmail(user.getEmail());
user1.setPassword(user.getPassword());
user1.setAbout(user.getAbout());
user1.setPhoneNumber(user.getPhoneNumber());
user1.setProfilePic("https://static.vecteezy.com/system/resources/thumbnails/010/260/479/small/default-avatar-profile-icon-of-social-media-user-in-clipart-style-vector.jpg");


User saveUser=userService.savUser(user1);


    Message.MessageBuilder message=Message.builder().content("Registration Successfully!!").type(MessageType.green);

session.setAttribute("message", message);
    return "redirect:/signup";
}


}
