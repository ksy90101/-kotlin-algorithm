package sum_matrix

class SumMatrix {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size) { i -> IntArray(arr1[i].size) }

        for (i: Int in arr1.indices) {
            for (j: Int in arr1[i].indices) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        
        return answer
    }
}