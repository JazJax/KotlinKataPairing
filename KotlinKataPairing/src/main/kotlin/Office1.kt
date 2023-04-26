
fun outed(meet: Map<String, Int>, boss: String): String {
    var average:Int = 0
    var total:Int = 0
    for (member in meet.keys) {
        if (member != boss) {
            total += meet[member]!!
        } else {
            total = total + meet[member]!! * 2
        }

    }
    average = total / meet.size
    if (average >= 5) {
        return "Nice Work Champ!"
    }
    return "Get Out Now!"
//    if (meet[boss]!! >= 5) {
//        return "Nice Work Champ!"
//    }
//    return "Get Out Now!"
}

