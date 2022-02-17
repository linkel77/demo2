package com.example2.demo2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication/*(exclude = [DataSourceAutoConfiguration::class])*/
class Demo2Application

fun main(args: Array<String>) {
    runApplication<Demo2Application>(*args)
}
