package com.roberto.projeto_spring_rest.controller;

import com.roberto.projeto_spring_rest.DAO.inputUser;
import com.roberto.projeto_spring_rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController{

    @Autowired
    private inputUser dao;

    @GetMapping
    public List<User> userList (){
        return (List<User>) dao.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        User newUser = dao.save(user);
        return user;
    }

    @PutMapping
    public User editUser(@RequestBody User user){
        User newUser = dao.save(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public Optional<User> deleteUser(@PathVariable Integer id){
        Optional<User> user = dao.findById(id);
        dao.deleteById(id);
        return user;
    }
}
