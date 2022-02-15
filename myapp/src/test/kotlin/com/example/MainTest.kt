package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `Should pass`() {
        assertEquals(true, true)
    }

    @Test
    fun `Should fail`() {
        assertEquals(true, false)
    }
}