package com.jake.springRebuildWithList.controller;


import com.jake.springRebuildWithList.data.UserRepository;
import com.jake.springRebuildWithList.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class introController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String homepage(){
        return "index";
    }

    @RequestMapping("/person/{name}")
    public String personPage(@PathVariable String name, ModelMap modelMap){
        User user = userRepository.findByName(name);
        modelMap.put("user", user);
        return "user";
    }

    @RequestMapping("/everybody")
    public String getAllPeople(ModelMap modelMap){
        List<User> everybody = userRepository.getAllUsers();
        modelMap.put("everybody", everybody);
        return "everybody";
    }
}
