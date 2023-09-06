package com.zakurdaevm.java.springboot.kotlinrest.service

import com.zakurdaevm.java.springboot.kotlinrest.datasource.KotlinExampleDataSource
import com.zakurdaevm.java.springboot.kotlinrest.model.KotlinExample
import org.springframework.stereotype.Service

@Service
class KotlinExampleService(private val dataSource: KotlinExampleDataSource) {
    fun getListOfExamples(): Collection<KotlinExample> = dataSource.retrieveKotlinExamples()
}