package mock_exam

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MockExamTest {
    @Test
    fun solutionTest() {
        val mockExam = MockExam();

        assertContentEquals(expected = mockExam.solution(intArrayOf(1, 2, 3, 4, 5)), actual = intArrayOf(1))
        assertContentEquals(expected = mockExam.solution(intArrayOf(1, 3, 2, 2, 4)), actual = intArrayOf(1, 2, 3))
    }
}