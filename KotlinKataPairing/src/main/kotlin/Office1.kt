/*
Here is link to the kata: https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/kotlin
 */
fun outed(meet: Map<String, Int>, boss: String): String {
    if(meet.any { it.value > 10 }){return "Choose a valid score!"}
    if ((meet.values.sum() + meet[boss]!!) / meet.size >= 5) return "Nice Work Champ!"
    return "Get Out Now!"

}

