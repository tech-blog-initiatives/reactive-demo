package org.tech.blog.reactivedemo.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JacksonConfiguration {

    @Bean
    fun objectMapper(): ObjectMapper {
        val objectMapper = ObjectMapper()
        objectMapper.registerModule(KotlinModule())
        return objectMapper
    }
}