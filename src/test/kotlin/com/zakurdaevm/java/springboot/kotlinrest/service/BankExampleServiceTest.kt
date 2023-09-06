package com.zakurdaevm.java.springboot.kotlinrest.service

import com.zakurdaevm.java.springboot.kotlinrest.datasource.BankExampleDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class BankExampleServiceTest{

    private val dataSource : BankExampleDataSource = mockk(relaxed = true)
    private val bankExampleService = BankExampleService(dataSource)
    @Test
    fun `should call its data source to retrieve examples` () {

        //when
       bankExampleService.getListOfExamples()

        //then
        verify(exactly = 1) { dataSource.retrieveBankExamples() }

    }
}