package com.github.cstroe.aik.sort

import org.junit.Test
import java.util.*

class InsertionSortTest {
    val random = Random()

    @Test fun simpleSort() {
        val expected = arrayOf(1, 2, 4, 5, 7, 9)
        val output = insertionSort(arrayOf(1, 7, 5, 4, 9, 2))
        assert(expected contentEquals output, { -> "Output array ${output.contentDeepToString()} is not equal to ${expected.contentDeepToString()}" })
    }

    @Test fun randomlySorted() {
        val randomNumbers = (1 .. 10).map { random.nextInt() }.toTypedArray()
        if(isSorted(randomNumbers)) {
            val temp = randomNumbers[0]
            randomNumbers[0] = randomNumbers[9]
            randomNumbers[9] = temp
        }

        assert(!isSorted(randomNumbers))
        val sortedArray = insertionSort(randomNumbers)
        assert(isSorted(sortedArray), { -> "Array ${sortedArray.contentDeepToString()} is not sorted."})
        assert(sortedArray.size == randomNumbers.size)
        for(i in randomNumbers) {
            assert(sortedArray.contains(i))
        }
    }

}