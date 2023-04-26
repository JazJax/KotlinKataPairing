
fun outed(meet: Map<String, Int>, boss: String): String {
    if(meet.any { it.value > 10 }){return "Choose a valid score!"}
    if ((meet.values.sum() + meet[boss]!!) / meet.size >= 5) return "Nice Work Champ!"
    return "Get Out Now!"

}

