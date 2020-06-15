package com.example.demo.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "admin")
class Admin {
    @Id
    @GeneratedValue
    Long adminId

    String admin
}
