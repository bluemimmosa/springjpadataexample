/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.SpringBootDemoWithJPA.service;

import com.niraj.SpringBootDemoWithJPA.entity.User;
import com.niraj.SpringBootDemoWithJPA.repository.UserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class UserService {
    @Autowired
    UserRepository ur;
    
    public ArrayList<User> listAll(){
        return (ArrayList<User>) ur.findAll();
    }
    
    public User saveUser(User u){
        return ur.save(u);
    }
    
   
}
