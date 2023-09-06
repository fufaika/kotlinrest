package com.zakurdaevm.java.springboot.kotlinrest.service

import com.zakurdaevm.java.springboot.kotlinrest.datasource.BankExampleDataSource
import com.zakurdaevm.java.springboot.kotlinrest.model.BankExample
import org.springframework.stereotype.Service

@Service
class BankExampleService(private val dataSource: BankExampleDataSource) {
    fun getListOfExamples(): Collection<BankExample> = dataSource.retrieveBankExamples()
}