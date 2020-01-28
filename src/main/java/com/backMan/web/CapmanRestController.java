package com.backMan.web;

import com.backMan.dao.UserRepository;
import com.backMan.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CapmanRestController {
//    @Autowired
//    private UserRepository userRepository;
//    @GetMapping("/listUsers")
//    public List<Users> users(){
//        return  userRepository.findAll();
//
//    }
}
