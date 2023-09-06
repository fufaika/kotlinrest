package com.zakurdaevm.java.springboot.kotlinrest.datasource.mock

import com.zakurdaevm.java.springboot.kotlinrest.datasource.KotlinExampleDataSource
import com.zakurdaevm.java.springboot.kotlinrest.model.KotlinExample
import org.springframework.stereotype.Repository

@Repository
class MockKotlinExampleDataSource : KotlinExampleDataSource {
    val listOfKotlinExamples = listOf(
        KotlinExample(
            1,
            "UnmutableList",
            "listOf('triangle', 'square', 'circle')",
            "https://kotlinlang.org/docs/kotlin-tour-collections.html#list"
        )
    )
    override fun retrieveKotlinExamples() = listOfKotlinExamples

}