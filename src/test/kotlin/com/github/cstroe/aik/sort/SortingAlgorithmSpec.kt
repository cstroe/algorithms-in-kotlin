package com.github.cstroe.aik.sort

import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.subject.SubjectSpek
import java.util.*

object SortingAlgorithmSpec: SubjectSpek<SortingAlgorithm>({
    it("should sort an array of integers") {
        val expected = arrayOf(1, 2, 4, 5, 7, 9)
        val output = subject.sort(arrayOf(1, 7, 5, 4, 9, 2))
        assert(expected contentEquals output, { ->
            """
        Output array ${output.contentDeepToString()} is not equal
        to ${expected.contentDeepToString()}
        """
        })
    }

    it("should sort a randomly generated array of integers") {
        val random = Random()
        val randomNumbers = (1 .. 10).map { random.nextInt() }.toTypedArray()
        if(isSorted(randomNumbers)) {
            val temp = randomNumbers[0]
            randomNumbers[0] = randomNumbers[9]
            randomNumbers[9] = temp
        }

        assert(!isSorted(randomNumbers))
        val sortedArray = subject.sort(randomNumbers)
        assert(isSorted(sortedArray), { -> "Array ${sortedArray.contentDeepToString()} is not sorted."})
        assert(sortedArray.size == randomNumbers.size)
        for(i in randomNumbers) {
            assert(sortedArray.contains(i))
        }
    }

    it("should sort a single element array") {
        val array = subject.sort(arrayOf(10))
        assert(isSorted(array))
        assert(array[0] == 10)
    }

    it("should sort an empty array") {
        val array = subject.sort(arrayOf())
        assert(isSorted(array))
    }
})