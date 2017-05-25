package com.github.cstroe.aik.sort

import org.junit.Test

class InsertionSortTest {
    @Test fun simpleSort() {
        val input = arrayOf(1, 7, 5, 4, 9, 2)
        val expected = arrayOf(1, 2, 4, 5, 7, 9)
        assert(expected contentEquals insertionSort(input))
    }
}