/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.SpringBootDemoWithJPA.controller;

import com.niraj.SpringBootDemoWithJPA.entity.User;
import com.niraj.SpringBootDemoWithJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller
public class UserController {
    @Autowired
    UserService us;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root(){
        return "index";
    }
    
    @GetMapping("/login")
    public ModelAndView loginPage(){
        ModelAndView mav = new ModelAndView("loginform");
        mav.addObject("loginUser", new User());
        return mav;
    }
    
    @PostMapping("/loginProcess")
    public ModelAndView loginProcess(@ModelAttribute("loginUser") User user){
        ModelAndView mav = new ModelAndView();
        if(us.verifyUser(user)){
            mav.setViewName("dashboard");
            mav.addObject("loggedinuser", user);
            return mav;
        }
        else{
            mav.setViewName("loginform");
            mav.addObject("message", "Wrong Credentials.");
            return mav;
        }
    }
    
    @GetMapping("/listAll")
    public ModelAndView listAll(){
        ModelAndView mav = new ModelAndView("listusers");
        mav.addObject("userList", us.listAll());
        return mav;
    }
    
    @GetMapping("/register")
    public ModelAndView serveRegisterPage(){
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("newUser", new User());
        return mav;
    }
    
    @PostMapping("/registerUser")
    public ModelAndView processRegistration(@ModelAttribute("newUser") User user){
       ModelAndView mav = new ModelAndView("index");
       if(us.saveUser(user) != null){
           System.out.println(user);
           System.out.println("USer saved..");
       }
       else{
           System.out.println("Cannot save.");
           //user cannot be registered.
       }
       return mav;
    }
}
