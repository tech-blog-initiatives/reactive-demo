package org.tech.blog.reactivedemo.controller

import kotlinx.coroutines.runBlocking
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.tech.blog.reactivedemo.model.Employee
import org.tech.blog.reactivedemo.service.EmployeeService

@RestController
@RequestMapping("/employees")
class Employees(@Autowired private val employeeService: EmployeeService) {
    @PostMapping
    fun saveEmployee(employee: Employee) {
        runBlocking {
            val save = employeeService.saveEmployee(employee)
        }
    }
}