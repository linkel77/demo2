package com.example2.demo2.repositories

import com.example2.demo2.model.Student
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentsRepo : CrudRepository<Student,String> {

    @Query("select s from Student s")
    fun findMessages(): List<Student>

}