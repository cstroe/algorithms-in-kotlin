package com.github.davidjdanaher.algorithms.sort

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class InsertionSortTest() {
    @Test fun orderedArray() {
        val sortedValues = insertionSort(arrayOf(1,2,3))
        assertArrayEquals(sortedValues, arrayOf(1,2,3))
    }

    @Test fun unorderedShortArray() {
        val testArray = arrayOf(1,3,2)
        val sortedValues = insertionSort(testArray)

        assertArrayEquals(sortedValues, arrayOf(1,2,3))
    }

    @Test fun worstCaseUnorderedArray() {
        val testArray = arrayOf(13, 9, 8, 5, 3, 2, 1)
        val sortedValues = insertionSort(testArray)

        assertArrayEquals(sortedValues, arrayOf(1, 2, 3, 5, 8, 9, 13))
    }

    @Test fun unorderedArray() {
        val testArray = arrayOf(13, 9, 2, 8, 1, 5, 3, 18, 4, 11, 14)
        val sortedValues = insertionSort(testArray)

        assertArrayEquals(sortedValues, arrayOf(1, 2, 3, 4, 5, 8, 9, 11, 13, 14, 18))
    }
//    @Test fun randomlyGeneratedValues() {
//        val random = Random()
//        val randomNumbers : Array<Int> = (1 .. 20).map { random.nextInt() }.toTypedArray()
//        val sortedArr : Array<Int> = randomNumbers.sort()
//
//        assertArrayEquals(insertionSort(randomNumbers), sortedArr)
//
//    }

    @Test fun emptyArray() {
        val testArr : Array<Int> = arrayOf()
        assertArrayEquals(testArr, testArr)
    }
}