package com.notorious.controller;

import com.notorious.converter.DateConverter;
import com.notorious.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/converter")
public class DateHandler {
    @RequestMapping("/addDate")
    public String addDate(Date date){
        return date.toString();
    }

    @RequestMapping("/test")
    public String test(Date id){
        return id.toString();
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        return student.toString();
    }


}
