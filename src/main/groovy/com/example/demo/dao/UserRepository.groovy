package com.example.demo.dao

import com.example.demo.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long userId)
}