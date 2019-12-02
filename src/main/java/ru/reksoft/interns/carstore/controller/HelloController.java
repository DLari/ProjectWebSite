package ru.reksoft.interns.carstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public final class HelloController{

    private String formatGreeter(String name){
        return String.format("Hello, %s", name);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String greet( @RequestParam("name") final String name){
        if (StringUtils.isEmpty(name)){
            return formatGreeter("anymous");
        }
        else return formatGreeter(name);
    }
}