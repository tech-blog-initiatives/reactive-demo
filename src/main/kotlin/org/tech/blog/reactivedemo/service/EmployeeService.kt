package org.tech.blog.reactivedemo.service

import kotlinx.coroutines.delay
import org.springframework.stereotype.Service
import org.tech.blog.reactivedemo.model.Employee
import org.tech.blog.reactivedemo.repository.EmployeeRepository
import reactor.core.publisher.Mono

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {
    suspend fun saveEmployee(employee: Employee): Mono<Employee> {
        delay(1000)
        return employeeRepository.save(employee);
    }

    suspend fun saveDepartment(): Mono<String> {
        return Mono.empty();
    }
}