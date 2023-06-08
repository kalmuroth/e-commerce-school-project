package ecommerce.lbmat.mongo.controllers;

import ecommerce.lbmat.mongo.entities.User;
import ecommerce.lbmat.mongo.services.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
@AllArgsConstructor
public class UserController {
    private UserService service;

    @GetMapping({"/","/all"})
    public List<User> getAll(){
        return service.readAll();
    }
    @GetMapping("/search/{str}")
    public List<User> searchFor(@PathVariable String str){
        return service.findByStr(str);
    }
    @GetMapping("/{id}")
    public User getAllFilms(@PathVariable String id){
        return service.read(id);
    }

}