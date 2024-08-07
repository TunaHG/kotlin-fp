package chapter03

/**
 * 연습문제 3-10
 *
 * 연습문제 3-3에서 작성한 ``factorial`` 함수를 메모이제이션을 사용해서 개선해 보라.
 */

fun main() {
    require(1 == factorial(1))
    require(24 == factorial(4))
    require(5040 == factorial(7))
    require(3628800 == factorial(10))
}

private var memo = Array(100) { -1 }

private fun factorial(n: Int): Int = when {
    n == 0 -> 1
    memo[n] != -1 -> memo[n]
    else -> {
        memo[n] = n * factorial(n - 1)
        memo[n]
    }
}
