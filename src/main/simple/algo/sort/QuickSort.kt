package simple.algo.sort

class QuickSort {
    var performanceCount = 0

    fun sort(list: Array<Int>, low: Int, high: Int): Int {

        if(low >= high) {
            return performanceCount
        }

        val middle = low + (high - low) / 2
        val pivot = list[middle]

        var i = low
        var j = high

        while(i <= j) {
            while(list[i] < pivot) {
                performanceCount++
                i++
            }
            while (list[j] > pivot) {
                performanceCount++
                j--
            }
            if(i <= j) {
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

        return performanceCount
    }
}