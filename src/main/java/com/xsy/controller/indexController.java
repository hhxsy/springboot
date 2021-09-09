package com.xsy.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
@RequestMapping("/")
public class indexController {
    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam(value = "user") String user,@RequestParam(value = "Passwd") String password) {
//        System.out.println(map);
        System.out.println(user+": "+password);
        return "login success!";
    }



}
