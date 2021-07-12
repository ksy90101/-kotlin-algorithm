package x_numbers_spaced_by_n

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class XNumbersSpacedByNTest {
    @Test
    fun solutionTest() {
        val xNumbersSpacedByN = XNumbersSpacedByN()

        assertContentEquals(xNumbersSpacedByN.solution(2, 5), longArrayOf(2, 4, 6, 8, 10))
        assertContentEquals(xNumbersSpacedByN.solution(4, 3), longArrayOf(4, 8, 12))
        assertContentEquals(xNumbersSpacedByN.solution(-4, 2), longArrayOf(-4, -8))
    }
}