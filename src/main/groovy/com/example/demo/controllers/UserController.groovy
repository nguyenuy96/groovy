package com.example.demo.controllers

import com.example.demo.dto.UserDTO
import com.example.demo.models.User
import com.example.demo.services.UserService
import groovy.json.JsonOutput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

import javax.validation.Valid

@RestController
@RequestMapping(value = 'user')
class UserController {
    @Autowired
    private  UserService userProcessor
    @GetMapping(value = '/{id}')
    @ResponseStatus(HttpStatus.OK)
    String findUserById(@PathVariable String id) {
        JsonOutput.toJson(userProcessor.getUserById(id))
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    String createUser(@RequestBody @Valid User user) {
        JsonOutput.toJson(userProcessor.createNewUser(user))
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    def findAllUser() {
        userProcessor.getUser()
    }

    @PostMapping(value = '/new')
    @ResponseStatus(HttpStatus.CREATED)
    String addUser(@RequestBody @Valid UserDTO userDTO, BindingResult bindingResult) {

        String msg = 'OK'
        if(bindingResult.hasErrors()) {
            msg = 'required fields are missing'
        }
        JsonOutput.toJson(aaaaa: 'asdasd', asdasda: 'asdasdasdasda')

    }
}
