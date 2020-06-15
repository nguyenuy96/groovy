package com.example.demo.services

import com.example.demo.models.User

interface UserService {
    User createNewUser(User user)
    def getUserById(String id)
    def getUser()
}