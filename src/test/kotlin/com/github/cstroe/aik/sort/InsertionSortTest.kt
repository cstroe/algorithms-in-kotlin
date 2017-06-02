package com.github.cstroe.aik.sort

import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.subject.SubjectSpek
import org.jetbrains.spek.subject.itBehavesLike
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object InsertionSortSpec: SubjectSpek<InsertionSort> ({
    subject { InsertionSort() }

    describe("the insertion sort algorithm") {
        itBehavesLike(SortingAlgorithmSpec)
    }
})