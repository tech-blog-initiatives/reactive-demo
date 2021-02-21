package org.tech.blog.reactivedemo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document
data class Employee(
    @Id private val id: String = UUID.randomUUID().toString(),
    private val name: String,
    private val department: String
)
