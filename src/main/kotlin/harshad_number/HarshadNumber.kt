package harshad_number

class HarshadNumber {
    fun solution(x: Int): Boolean {
        var number = 0;
        var xNumber = x;

        while (xNumber > 0) {
            number += xNumber % 10;
            xNumber /= 10
        }

        return x % number == 0;
    }
}
