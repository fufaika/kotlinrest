package com.zakurdaevm.java.springboot.kotlinrest.model

data class KotlinExample(
    val id: Long,
    var name: String,
    var example: String,
    var link: String = ""
)