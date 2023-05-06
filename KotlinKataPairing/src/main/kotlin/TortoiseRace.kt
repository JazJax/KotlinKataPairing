//Kata from https://www.codewars.com/kata/55e2adece53b4cdcb900006c

package tortoise


fun race(v1:Int, v2:Int, g:Int):IntArray {

    var time = 0
    var catchup = false
    while (!catchup)  {
        time++
        var distTort1 :Int = v1 * time + g
        var distTort2 :Int = v2 * time
        var distance :Int = distTort2 - distTort1
        if (distance >= 0) {
            catchup = true
        }
    }


    return intArrayOf(time, v1 * time + g, v2 * time)
}