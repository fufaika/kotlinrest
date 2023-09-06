package com.zakurdaevm.java.springboot.kotlinrest.datasource

import com.zakurdaevm.java.springboot.kotlinrest.model.KotlinExample

interface KotlinExampleDataSource {

    fun retrieveKotlinExamples(): Collection<KotlinExample>
}