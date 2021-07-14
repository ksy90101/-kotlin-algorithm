package even_and_odd

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EvenAndOddTest {
    @Test
    fun solutionTest() {
        val oddAndOdd = EvenAndOdd()

        assertEquals(oddAndOdd.solution(3), "Odd")
        assertEquals(oddAndOdd.solution(4), "Even")
    }
}