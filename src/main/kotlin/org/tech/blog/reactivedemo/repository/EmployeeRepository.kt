package org.tech.blog.reactivedemo.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import org.tech.blog.reactivedemo.model.Employee
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
interface EmployeeRepository : ReactiveCrudRepository<Employee, String> {

    override fun findAll(): Flux<Employee>

    override fun <S : Employee?> save(entity: S): Mono<S>
}