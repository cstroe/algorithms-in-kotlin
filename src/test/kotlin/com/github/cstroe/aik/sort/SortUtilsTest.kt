package com.github.cstroe.aik.sort

import org.junit.Test

class SortUtilsTest {
    @Test fun emptyArrayIsSorted() {
        assert(isSorted(arrayOf()))
    }

    @Test fun arrayOfOneElementIsSorted() {
        assert(isSorted(arrayOf(5)))
    }

    @Test fun sortedArrayIsSorted() {
        assert(isSorted(arrayOf(1, 2, 3, 4, 5)))
    }

    @Test fun unsortedArrayIsUnsorted() {
        assert(!isSorted(arrayOf(2, 1, 3, 4, 5)))
    }

    @Test fun arrayWithDuplicateElementsIsSorted() {
        assert(isSorted(arrayOf(2, 2, 3, 4, 5)))
    }
}