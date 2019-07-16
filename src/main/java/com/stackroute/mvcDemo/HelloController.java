package com.stackroute.mvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//controller class
@Controller
public class HelloController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String display(Model model) {
        //creating user object
        User user=new User();
        //set message
        user.setMessage("Welcome to Stackroute");
        //add attribute to the model
        model.addAttribute("message",user.getMessage());
        //returning index.jsp file
        return "index";
    }
}
