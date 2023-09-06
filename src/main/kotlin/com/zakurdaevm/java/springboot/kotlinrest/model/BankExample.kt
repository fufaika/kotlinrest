package com.zakurdaevm.java.springboot.kotlinrest.model

data class BankExample(
    val id: Long,
    var name: String,
    var example: String,
    var link: String = ""
)