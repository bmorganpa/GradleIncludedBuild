package com.example

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun `Should pass`() {
        Assertions.assertEquals(true, true)
    }

    @Test
    fun `Should fail`() {
        Assertions.assertEquals(true, false)
    }
}