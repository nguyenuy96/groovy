package com.example.demo.dao

import com.example.demo.models.User

interface UserDao {
    void save(User user)
    User getById(int userId)
    List<User> getAll()
    User getByName(String userName)
    void delete(int id)
    void update(User user)
}