package com.zakurdaevm.java.springboot.kotlinrest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping
    fun helloWorld(): String = "Hello, this is a REST endpoint!"

    @GetMapping("function")
    fun helloWorldFunction(): String = "Hello, this is a REST endpoint from function!"

    @GetMapping("experiment2")
    fun helloWorldFunctionExperiment(): String = "Hello, this is a REST endpoint from experiment function!"
}