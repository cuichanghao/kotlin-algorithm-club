package simple.algo.sort

import org.junit.After
import org.junit.Before
import org.junit.Test
import simple.algo.sort.BubbleSort
import simple.algo.sort.SelectionSort

class SortTest {

    private val testData: Array<Int> = arrayOf(1,4,5,6,3,2,7,0,8,9)

    @Before
    fun before() {
        println("original data")
        testData.forEach(::println)
    }

    @After
    fun after() {
        println("sort data")
        testData.forEach(::println)
    }


    @Test
    fun bubbleTest() {
        val performance = BubbleSort().sort(testData)
        println("Big O performance: $performance")
    }

    @Test
    fun selectionTest() {
        val performance = SelectionSort().sort(testData)
        println("Big O performance: $performance")
    }

    @Test
    fun quickSortTest() {
        val count = QuickSort().sort(testData, 0, testData.size - 1)
        println("Big O performance: $count")
    }
}