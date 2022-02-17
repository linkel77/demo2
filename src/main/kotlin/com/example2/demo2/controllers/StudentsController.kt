package com.example2.demo2.controllers

import com.example2.demo2.model.Student
import com.example2.demo2.repositories.StudentsRepo
import com.example2.demo2.services.StudentsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentResource(val service:StudentsService) {

    @GetMapping("getallstudents")
    fun getAllStudents(): List<Student>{

        return service.findStudents()
    }

    @PostMapping
    fun post(@RequestBody student: Student) {
        service.post(student)
    }
}