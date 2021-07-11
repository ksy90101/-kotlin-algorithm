package mock_exam

import kotlin.math.max

class MockExam {
    fun solution(answers: IntArray): IntArray {
        val students = IntArray(3) { 0 }
        for (i in answers.indices) {
            val answer = answers[i];

            if (answer == Giver.ONE.answers[(i % 5)]) {
                students[0] = students[0] + 1;
            }
            if (answer == Giver.TWO.answers[(i % 8)]) {
                students[1] = students[1] + 1;
            }
            if (answer == Giver.THREE.answers[(i % 10)]) {
                students[2] = students[2] + 1;
            }
        }

        val max = max(students[0], max(students[1], students[2]))

        val resultList = mutableListOf<Int>()

        for (i in students.indices) {
            if (max == students[i]) {
                resultList.add(i + 1);
            }
        }

        val results = IntArray(resultList.size)

        for (i in resultList.indices) {
            results[i] = resultList[i]
        }

        return results;
    }
}

enum class Giver(val answers: IntArray) {
    ONE(intArrayOf(1, 2, 3, 4, 5)),
    TWO(intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)),
    THREE(intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
}