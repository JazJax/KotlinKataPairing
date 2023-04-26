//left side
val leftSide = mapOf(
    'w' to 4,
    'p' to 3,
    'b' to 2,
    's' to 1
)

//right side
val rightSide = mapOf(
    'm' to 4,
    'q' to 3,
    'd' to 2,
    'z' to 1
)

fun alphabetWar(fight: String): String {
    val splitList = fight.partition { it in rightSide }
    val rightSideSum = splitList.first.sumOf { rightSide[it]?: 0 }
    val leftSideSum = splitList.second.sumOf { leftSide[it]?: 0 }

    val total = rightSideSum - leftSideSum
   return when {
        total == 0 -> "Let's fight again!"
        total > 0 -> "Right side wins!"
        total < 0 -> "Left side wins!"
       else -> "Let's fight again!"
   }
}

