package com.zakurdaevm.java.springboot.kotlinrest.service

import com.zakurdaevm.java.springboot.kotlinrest.datasource.KotlinExampleDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

class KotlinExampleServiceTest{

    private val dataSource : KotlinExampleDataSource = mockk(relaxed = true)
    private val kotlinExampleService = KotlinExampleService(dataSource)
    @Test
    fun `should call its data source to retrieve examples` () {

        //when
       kotlinExampleService.getListOfExamples()

        //then
        verify(exactly = 1) { dataSource.retrieveKotlinExamples() }

    }
}