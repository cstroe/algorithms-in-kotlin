package com.github.cstroe.aik.sort

fun isSorted(ints: Array<Int>): Boolean {
    if(ints.isEmpty() || ints.size == 1) {
        return true
    }

    for(i in 0 .. ints.size - 2) {
        if(ints[i] > ints[i+1]) {
            return false
        }
    }
    return true
}