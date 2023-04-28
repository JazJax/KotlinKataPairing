/*
Here is link to the kata: https://www.codewars.com/kata/63b84f54693cb10065687ae5/kotlin
 */
fun createBox(width: Int, length: Int): Array<IntArray> {
    val arr = Array(length) { IntArray(width) }

    var leftCol = 0 // it equals topRow
    var rightCol = width - 1
    var downRow = length - 1
    var element = 1

    while (leftCol <= rightCol && leftCol <= downRow) {
        for (i in leftCol..rightCol) {
            arr[leftCol][i] = element
            arr[downRow][i] = element
        }

        for (j in leftCol..downRow){
            arr[j][leftCol] = element
            arr[j][rightCol] =  element
        }

        leftCol += 1
        rightCol -= 1
        downRow -= 1
        element += 1
    }

    return arr
}