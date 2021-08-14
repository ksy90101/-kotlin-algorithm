package harshad_number

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class HarshadNumberTest {
    @Test
    fun solutionTest() {
        val harshadNumber = HarshadNumber()

        assertTrue(harshadNumber.solution(10))
        assertTrue(harshadNumber.solution(12))
        assertFalse(harshadNumber.solution(11))
        assertFalse(harshadNumber.solution(13))
    }
}