package simple.algo.sort

interface ISort {
    /**
     * return Big O performance Count
     */
    fun<T : Comparable<T>> sort(list: Array<T>): BigOPerformance
}