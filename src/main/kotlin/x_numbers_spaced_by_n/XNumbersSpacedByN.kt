package x_numbers_spaced_by_n

class XNumbersSpacedByN {
    fun solution(x: Int, n: Int): LongArray = LongArray(n) { i -> x.toLong() * (i + 1) }
}