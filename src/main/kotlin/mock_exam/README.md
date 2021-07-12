# [\[프로그래머스\] 모의고사](https://programmers.co.kr/learn/courses/30/lessons/42840)

## 문제 설명

수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ... 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ... 3번
수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

### 제한 조건

- 시험은 최대 10,000 문제로 구성되어있습니다.
- 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
- 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

### 입출력 예

| answers | return |
| :---: | :---: | 
| [1,2,3,4,5] | [1] | 
| [1,3,2,4,2] | [1,2,3] |

### 입출력 예 설명

#### 입출력 예 #1

- 수포자 1은 모든 문제를 맞혔습니다.
- 수포자 2는 모든 문제를 틀렸습니다.
- 수포자 3은 모든 문제를 틀렸습니다.
- 따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

#### 입출력 예 #2

- 모든 사람이 2문제씩을 맞췄습니다.

## 정답

```kotlin
package mock_exam

import kotlin.math.max

class MockExam {
    fun solution(answers: IntArray): IntArray {
        val students = IntArray(3) { 0 }
        for (i: Int in answers.indices) {
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

        val max: Int = max(students[0], max(students[1], students[2]))

        val resultList = mutableListOf<Int>()

        for (i: Int in students.indices) {
            if (max == students[i]) {
                resultList.add(i + 1);
            }
        }

        val results = IntArray(resultList.size)

        for (i: Int in resultList.indices) {
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
```

```kotlin
package mock_exam;

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
```

## 코틀린 문법

### indices

```kotlin
/**
 * Returns the range of valid indices for the array.
 */
public val IntArray.indices: IntRange
    get() = IntRange(0, lastIndex)
```

- 배열의 모든 인덱스를 꺼낼때 유용합니다.
- 위와 같이 for문과 같이 사용하면 0부터 마지막 인덱스까지 순차적으로 꺼내줍니다.

