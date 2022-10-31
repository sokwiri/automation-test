package com.example.bookcave

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class ExampleUnitTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val sum = calculator.add(2,2)
        assertEquals(4, sum)
    }
    @Test
    fun subtraction_isCorrect(){
        val diff = calculator.subtract(10,5)
        assertEquals(5,diff)
    }
    @Test
    fun addition_isWrong(){
        val sum = calculator.add(3,4)
        assertNotEquals(8,sum)
    }
    @Test
    fun subtraction_isWrong(){
        val diff = calculator.subtract(20,30)
        assertNotEquals(15,diff)
    }
    @After
    fun tearDown(){
        // calculator = null
    }
}