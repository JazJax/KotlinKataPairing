/*
Here is link to the kata: https://www.codewars.com/kata/61123a6f2446320021db987d/train/kotlin
 */
fun prevMultOfThree(n: Int): Int? {
    var number = n
    while (number > 10) {
        if (number % 3 == 0) return number
        number = number / 10
    }

    val result = when {
        number % 3 == 0 -> number
        number % 3 != 0 -> null
        else -> null
    }

    return result

}

/*
Another solution:
fun prevMultOfThree(n: Int): Int? = when{
    n == 0 -> null
    n % 3 == 0 -> n
    else -> prevMultOfThree(n / 10)
}
*/