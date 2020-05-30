package com.notorious.controller;

import com.notorious.entity.Address;
import com.notorious.entity.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/view")
public class ViewHandler {
    @RequestMapping("/map")
    public String map(Map<String, User> map) {
        User user = new User();
        user.setId(1L);
        user.setName("何瑞");
        user.setAddress(new Address("重庆"));
        map.put("hello", user);
        return "view";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        model.addAttribute("hello", user);
        return "view";
    }

//    @RequestMapping("/request")
//    public String request(HttpServletRequest) {
//
//    }

    @ModelAttribute
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

    @RequestMapping("/modelAttribute")
    public String modelAndView(){
        return "view";
    }
}
