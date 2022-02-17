package com.example2.demo2.services

import com.example2.demo2.model.Student
import com.example2.demo2.repositories.StudentsRepo
import org.springframework.stereotype.Service

@Service
class StudentsService(val db:StudentsRepo) {

 fun post(student:Student){
  db.save(student)
 }
 fun findStudents(): List<Student> = db.findMessages()
}