package com.github.cstroe.aik.sort

fun insertionSort(A: Array<Int>): Array<Int> {
    for(j in 1 .. A.size - 1) {
        val key = A[j]
        var i = j - 1
        while (i > -1 && A[i] > key) {
            A.set(i + 1, A[i])
            i = i - 1
        }
        A.set(i + 1, key)
    }
    return A
}
