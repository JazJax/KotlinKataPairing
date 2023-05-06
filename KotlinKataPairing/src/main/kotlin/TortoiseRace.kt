package tortoise
fun race(v1: Int, v2: Int, g: Int): IntArray {
    if (v2 <= v1) {
        return intArrayOf() // if tortoise 2 is slower or same pace as v1, they never catch up
    }

    // bulb was telling me else is redundant so I expect that it is not used in Kotlin that often
    val timeInSeconds = (g * 3600) / (v2 - v1) //g is initial lead, v2 - v1 relative pace difference per hour (aka 3600 sec),
    // tortoise B needs first to cover 70ft difference 70 * (850/3600) = cca 16 mins but
    val hours = timeInSeconds / 3600
    val minutes = (timeInSeconds % 3600) / 60
    val seconds = timeInSeconds % 60

    return intArrayOf(hours, minutes, seconds)
}

// solution in Python:
/*
def race(v1, v2, g):
if v2 <= v1:
return []

time_in_seconds = g * 3600 // (v2 - v1)
hours = time_in_seconds // 3600
minutes = (time_in_seconds % 3600) // 60
seconds = time_in_seconds % 60

return [hours, minutes, seconds]
*/
