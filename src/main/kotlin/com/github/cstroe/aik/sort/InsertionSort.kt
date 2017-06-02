package com.github.cstroe.aik.sort

class InsertionSort: SortingAlgorithm {
    override fun sort(array: Array<Int>): Array<Int> {
        for(j in 1 .. array.size - 1) {
            val key = array[j]
            var i = j - 1
            while (i > -1 && array[i] > key) {
                array.set(i + 1, array[i])
                i = i - 1
            }
            array.set(i + 1, key)
        }
        return array
    }
}
