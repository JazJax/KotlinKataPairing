/*
Here is link to the kata: https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/kotlin
 */

fun evenNumbers(array: List<Int>, number: Int): List<Int> {
//    return array.partition(::isEven).first.reversed().take(number).reversed()
    return array.filter{ it % 2 == 0 }.takeLast(number)
}