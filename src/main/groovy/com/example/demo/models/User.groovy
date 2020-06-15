package com.example.demo.models

import org.hibernate.annotations.NaturalId

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "user")
class User {
    @Id
    @GeneratedValue
    Long userId
    @NotNull
    String userName
    @NotNull
    String passWord
    @Column(columnDefinition = "varchar(255) default 'abc'")
    String define

    @NaturalId
    String abc

    String hieu

}
