/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    id("org.springframework.boot") version "2.4.1"
}

apply(plugin = "io.spring.dependency-management")

repositories {
    jcenter()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
}

group = "org.tech.blog"
version = "0.0.1-SNAPSHOT"
description = "reactive-demo"
java.sourceCompatibility = JavaVersion.VERSION_1_8


tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}