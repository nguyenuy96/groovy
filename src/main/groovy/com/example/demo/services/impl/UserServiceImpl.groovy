package com.example.demo.services.impl

import com.example.demo.dao.UserDao
import com.example.demo.models.User
import com.example.demo.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(propagation = Propagation.REQUIRED)
class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao

    @Override
    void addNewUser(User user) {
        userDao.save(user)
    }

    @Override
    User getUserById(int id) {
        return userDao.getById(id)
    }
}
