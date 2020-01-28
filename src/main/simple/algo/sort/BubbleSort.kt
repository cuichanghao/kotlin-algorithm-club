package simple.algo.sort

class BubbleSort {
    fun sort(list: Array<Int>): BigOPerformance {
        val bigOPerformance = BigOPerformance()

        for(i in list.indices) {
            for(j in 0 until list.size - 1 - i) {
                bigOPerformance.loopCount++
                if(list[j] > list[j+1]) {
                    bigOPerformance.swapCount++
                    list.swap(j, j+1)
                }
            }
        }
        return bigOPerformance
    }
}

class BubbleSortGeneric: ISort {
    override fun<T : Comparable<T>> sort(list: Array<T>): BigOPerformance {
        val bigOPerformance = BigOPerformance()

        for(i in list.indices) {
            for(j in 0 until list.size - 1 - i) {
                bigOPerformance.loopCount++
                if(list[j] > list[j+1]) {
                    bigOPerformance.swapCount++
                    list.swap(j, j+1)
                }
            }
        }
        return bigOPerformance
    }
}