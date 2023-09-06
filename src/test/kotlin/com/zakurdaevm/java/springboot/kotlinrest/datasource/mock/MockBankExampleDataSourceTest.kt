package com.zakurdaevm.java.springboot.kotlinrest.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankExampleDataSourceTest {

    private val mockBankExampleDataSource = MockBankExampleDataSource()
    @Test
    fun `should provide a collection of bank examples`() {

        //when
        val bankExamples = mockBankExampleDataSource.retrieveBankExamples()

        //then
        assertThat(bankExamples).isNotEmpty()

    }
    
    @Test
    fun `should provide some mock data` () {

        //when
        val bankExamples = mockBankExampleDataSource.retrieveBankExamples()
        
        //then
        assertThat(bankExamples).allMatch(){ it.name.isNotEmpty()}
    
    }
}