package com.example.demo.services.processor

import com.example.demo.dao.UserRepository
import com.example.demo.models.User
import com.example.demo.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
class UserProcessor implements UserService{
    @Autowired
    private UserRepository userRepository


    @Transactional
    private User addNewUser(User user) {
        userRepository.saveAndFlush(new User(
                userName: user.userName,
                passWord: user.passWord
        ))
        userRepository.findByUserId(user.userId)
    }

    @Override
    User createNewUser(User savedUser) {
        User user = addNewUser(savedUser)
        userRepository.findByUserId(user.userId)
    }

    @Override
    def getUserById(String id) {
        userRepository.findByUserId(Long.valueOf(id))
    }

    @Override
    def getUser() {
        userRepository.findAll()
    }
}
