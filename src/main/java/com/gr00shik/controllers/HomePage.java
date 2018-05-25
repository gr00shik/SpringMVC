package com.gr00shik.controllers;

import com.gr00shik.dao.units.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomePage {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView goHomePage(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

}
