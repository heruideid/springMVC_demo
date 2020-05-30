package com.notorious.controller;

import com.notorious.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloHandler {
    @RequestMapping(value="/index",method = RequestMethod.GET,params = {"name","id=10"})
    public String index(@RequestParam("name") String name,@RequestParam("id") int id){
        System.out.println("返回index");
        System.out.println("name is "+name+" id is "+id);
        return "index";
    }

    @RequestMapping("/index/{name}/{id}")
    public String restIndex(@PathVariable("name") String name,@PathVariable("id") int id){
        System.out.println(name);
        System.out.println(id);
        return "index";
    }

//    @RequestMapping("/cookie")
//    public String cookie(@CookieValue(value = "JSESSIONID") String sessionId){
//        System.out.println(sessionId);
//        return "index";
//    }

    @RequestMapping("/cookie")
    public String cookie(@CookieValue(value = "JSESSIONID") String sessionId){
        System.out.println(sessionId);
        return "index";
    }

    @RequestMapping(value="save",method = RequestMethod.POST)
    public String save(User user){
        System.out.println(user);
        return "index";
    }

    @RequestMapping("/forward")
    public String forward(){
        return "forward:/index.jsp";
    }

    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/index.jsp";
    }

}
