package simple.algo.sort

class SelectionSort {
    fun sort(list: Array<Int>): BigOPerformance {
        val bigOPerformance = BigOPerformance()
        for(i in list.indices) {
            var minIndex = i
            for( j in i+1 until list.size) {
                bigOPerformance.loopCount++
                if(list[minIndex] > list[j]) {
                    minIndex = j
                }
            }

            // lowest is not in i position, but in j position.
            if(minIndex != i) {
                bigOPerformance.swapCount++
                list.swap(minIndex, i)
            }
        }
        return bigOPerformance
    }
}