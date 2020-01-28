package simple.algo.sort

class QuickSort {
    var bigOPerformance = BigOPerformance()

    fun sort(list: Array<Int>, low: Int, high: Int): BigOPerformance {

        if(low >= high) {
            return bigOPerformance
        }

        val middle = low + (high - low) / 2
        val pivot = list[middle]

        var i = low
        var j = high

        while(i <= j) {
            while(list[i] < pivot) {
                bigOPerformance.loopCount++
                i++
            }
            while (list[j] > pivot) {
                bigOPerformance.loopCount++
                j--
            }
            if(i <= j) {
                bigOPerformance.swapCount++
                list.swap(i,j)
                i++
                j--
            }
        }

        if(low < j) {
            sort(list, low, j)
        }
        if(high > j) {
            sort(list, i, high)
        }

        return bigOPerformance
    }
}