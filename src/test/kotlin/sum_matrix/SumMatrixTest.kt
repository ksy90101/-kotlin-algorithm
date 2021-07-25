package sum_matrix

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SumMatrixTest {
    @Test
    fun solutionTest() {
        val sumMatrix = SumMatrix()

        assertTrue(
            sumMatrix.solution(
                arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
                arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
            ).contentDeepEquals(arrayOf(intArrayOf(4, 6), intArrayOf(7, 9)))
        )
        assertTrue(
            sumMatrix.solution(
                arrayOf(intArrayOf(1), intArrayOf(2)),
                arrayOf(intArrayOf(3), intArrayOf(4))
            ).contentDeepEquals(arrayOf(intArrayOf(4), intArrayOf(6)))
        )
    }
}