package ecommerce.lbmat.mongo.controllers;

import ecommerce.lbmat.mongo.entities.User;
import ecommerce.lbmat.mongo.services.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/users")
@Slf4j
@AllArgsConstructor


public class UserController {
    private UserService service;
    @CrossOrigin
    @GetMapping({"/","/all"})
    public List<User> getAllUser(){
        return service.readAll();
    }
    @RequestMapping(value = "/signin", method=POST)
    public List<User> signIn(String email, String password){
        return service.findByLoginPassword(email,password);
    }
    //@CrossOrigin(origins = "http://localhost:54714")

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){
        return service.read(id);
    }
    @RequestMapping(value = "/add", method=POST)
    public User postUser(User user){
        return service.create(user);
    }
}