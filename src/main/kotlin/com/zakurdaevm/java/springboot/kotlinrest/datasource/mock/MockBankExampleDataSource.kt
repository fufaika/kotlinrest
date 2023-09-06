package com.zakurdaevm.java.springboot.kotlinrest.datasource.mock

import com.zakurdaevm.java.springboot.kotlinrest.datasource.BankExampleDataSource
import com.zakurdaevm.java.springboot.kotlinrest.model.BankExample
import org.springframework.stereotype.Repository

@Repository
class MockBankExampleDataSource : BankExampleDataSource {
    val listOfBankExamples = listOf(
        BankExample(
            1,
            "UnmutableList",
            "listOf('triangle', 'square', 'circle')",
            "https://kotlinlang.org/docs/kotlin-tour-collections.html#list"
        )
    )
    override fun retrieveBankExamples() = listOfBankExamples

}