package com.stackroute.mvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String display(Model model) {
        User user=new User();
        user.setMessage("Welcome to Stackroute");
        model.addAttribute("message",user.getMessage());
        return "user";
    }
}
