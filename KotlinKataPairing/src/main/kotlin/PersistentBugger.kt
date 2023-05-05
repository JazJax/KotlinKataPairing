// Link to the kata: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/kotlin

fun persistence(num: Int) : Int {
    var strNum = num.toString()
    var numberOfTimes: Int = 0

    while(strNum.length > 1) {
        var result: Int = 1
        for (d in strNum) {
            result *= d.digitToInt()
        }
        numberOfTimes += 1
        strNum = result.toString()

    }
    return numberOfTimes
}