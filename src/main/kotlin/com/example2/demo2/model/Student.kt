package com.example2.demo2.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Student(val name: String = "", val age: Int = 0, val address: String = "", @Id @GeneratedValue var id: Long? = null)



