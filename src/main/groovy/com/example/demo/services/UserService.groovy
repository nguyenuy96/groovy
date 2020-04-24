package com.example.demo.services

import com.example.demo.models.User

interface UserService {
    void addNewUser(User user)
    User getUserById(int id)
}