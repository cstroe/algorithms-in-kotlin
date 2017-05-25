package com.github.cstroe.aik.sort

import org.junit.Test

class InsertionSortTest {
    @Test fun simpleSort() {
        val expected = arrayOf(1, 2, 4, 5, 7, 9)
        val output = insertionSort(arrayOf(1, 7, 5, 4, 9, 2))
        assert(expected contentEquals output, { -> "Output array ${output.contentDeepToString()} is not equal to ${expected.contentDeepToString()}" })
    }
}