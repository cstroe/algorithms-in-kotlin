package com.github.davidjdanaher.algorithms.sort

fun insertionSort(arr : Array<Int>): Array<Int> {
    var sortedElement : Int
    var testElement : Int
    var i : Int

    for (j in 1..arr.lastIndex) {
        testElement = arr[j]
        i = j - 1

        while (i > -1 && testElement < arr[i]) {
            sortedElement = arr[i]
            arr.set(i + 1, sortedElement)
            i--
        }
        arr.set(i + 1, testElement)
    }

    return arr
}
