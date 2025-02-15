package chapter05

import chapter05.FunList.Cons
import chapter05.FunList.Nil

/**
 *
 * 연습문제 5-3
 *
 * 리스트의 첫번째 값을 가져오는 getHead 함수를 작성해 보자.
 *
 * 힌트: 함수의 선언 타입은 아래와 같다.
 *      빈 리스트일 경우에는 NoSuchElementException 을 발생시키자.
 *
 */

fun main() {

    val intList = Cons(1, Cons(2, Cons(3, Nil)))
    require(intList.getHead() == 1)

}
