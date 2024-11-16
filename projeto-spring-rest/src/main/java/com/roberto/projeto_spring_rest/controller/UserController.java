package com.roberto.projeto_spring_rest.controller;

import com.roberto.projeto_spring_rest.DAO.inputUser;
import com.roberto.projeto_spring_rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<User>> userList (){
        List<User> list = (List<User>) dao.findAll();
        return ResponseEntity.status(200).body(list);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = dao.save(user);
        return ResponseEntity.status(201).body(newUser);
    }

    @PutMapping
    public ResponseEntity<User> editUser(@RequestBody User user){
        User newUser = dao.save(user);
        return ResponseEntity.status(201).body(newUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>deleteUser(@PathVariable Integer id){
        dao.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
