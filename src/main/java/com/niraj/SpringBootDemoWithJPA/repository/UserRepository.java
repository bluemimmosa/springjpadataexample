/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.SpringBootDemoWithJPA.repository;

import com.niraj.SpringBootDemoWithJPA.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dell
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
   
}
