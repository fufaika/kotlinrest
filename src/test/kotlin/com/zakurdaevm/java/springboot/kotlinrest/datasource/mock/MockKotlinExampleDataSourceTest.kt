package com.zakurdaevm.java.springboot.kotlinrest.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockKotlinExampleDataSourceTest {

    private val mockKotlinExampleDataSource = MockKotlinExampleDataSource()
    @Test
    fun `should provide a collection of kotlin examples`() {

        //when
        val kotlinExamples = mockKotlinExampleDataSource.retrieveKotlinExamples()

        //then
        assertThat(kotlinExamples).isNotEmpty()

    }
    
    @Test
    fun `should provide some mock data` () {

        //when
        val kotlinExamples = mockKotlinExampleDataSource.retrieveKotlinExamples()
        
        //then
        assertThat(kotlinExamples).allMatch(){ it.name.isNotEmpty()}
    
    }
}