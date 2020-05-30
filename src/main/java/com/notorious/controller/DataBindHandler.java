package com.notorious.controller;

import com.notorious.entity.User;
import com.notorious.entity.UserList;
import com.notorious.entity.UserMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/data")
public class DataBindHandler {
    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id){
        return "get out";
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value="num",required = true,defaultValue = "10") Integer id){
        return ""+id;
    }

    @RequestMapping("/array")
    @ResponseBody
    public String arrayType(String[] name){
        return Arrays.toString(name);
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(UserList userList){
        StringBuffer str=new StringBuffer();
        for(User user:userList.getUsers()){
            str.append(user);
        }
        System.out.println(str.toString());
        return str.toString();
    }

    @RequestMapping("/map")
    @ResponseBody
    public String map(UserMap userMap){
        StringBuffer str=new StringBuffer();
        for(String key:userMap.getUsers().keySet()){
            User val=userMap.getUsers().get(key);
            str.append(val);
        }
        System.out.println(str.toString());
        return str.toString();
    }
}
