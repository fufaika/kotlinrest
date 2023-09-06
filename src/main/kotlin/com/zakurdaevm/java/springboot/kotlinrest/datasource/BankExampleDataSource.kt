package com.zakurdaevm.java.springboot.kotlinrest.datasource

import com.zakurdaevm.java.springboot.kotlinrest.model.BankExample

interface BankExampleDataSource {

    fun retrieveBankExamples(): Collection<BankExample>
}