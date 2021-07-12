package rectangular_star

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RectangularStarTest {
    @Test
    fun solutionTest() {
        val rectangularStar = RectangularStar()

        assertEquals(expected = rectangularStar.solution(arrayOf(5, 3)), actual = "*****\n*****\n*****\n")
    }
}