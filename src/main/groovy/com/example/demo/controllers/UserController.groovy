package com.example.demo.controllers

import com.example.demo.models.User
import com.example.demo.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('user')
class UserController {
    @Autowired
    private  UserService userService
    @GetMapping('{userId}')
    ResponseEntity<User> getUserById(@PathVariable int userId) {
       return new ResponseEntity<User>(userService.getUserById(userId), HttpStatus.OK)
    }

    @PostMapping('')
    ResponseEntity<HttpStatus> addNewUser(@RequestBody User user) {
        userService.addNewUser(user)
        return new ResponseEntity<>(HttpStatus.OK)
    }
}
