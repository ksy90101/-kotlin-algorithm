# [\[프로그래머스\] 짝수와 홀수](https://programmers.co.kr/learn/courses/30/lessons/12937)

## 특이사항

- 코틀린은 3항 연산자가 없다. 따라서 if ~ else를 사용해야 한다.
- 코틀린은 람다가 잘 구현되어 있다. 아래와 같이 람다로 구현하면 더 가독성이 높아질수 있다.

## 문제 설명

정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

### 제한 조건

- num은 int 범위의 정수입니다.
- 0은 짝수입니다.

### 입출력 예

num | return
:---: | :---:
3| Odd
4 | Even

## 정답코드

```kotlin
class EvenAndOdd {
    fun solution(num: Int): String = if (num % 2 == 0) "Even" else "Odd"
}
```

```kotlin
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
```