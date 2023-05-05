//Kata from https://www.codewars.com/kata/55e2adece53b4cdcb900006c

package tortoise

import kotlin.concurrent.timer

// return [] if v1 >= v2
fun race(v1:Int, v2:Int, g:Int):IntArray {
    // in 30 mins: v1 360 + 70, v2 425
    // in 1 hour: v1 720 + 70, v2 850
    // n = time in mins

    // starting 0 time
    // they did not catch up = false until they catch up

    val start_time: Int = 0
    var time: Int = start_time + 1
    var catchup:Boolean = false
    while (catchup:Boolean is false) {

        var DistTort1 :Int = v1 * time + g
        var DistTort2 :Int = v2 * time
        var distance :Int = DistTort1 - DistTort2
        if (distance > 0) {
            catchup is false

    }   else {
            catchup is true
        }


   // var time = 0
    //var diffFlag:Boolean = false
    //while  (diffFlag is false) {
      //      var distance1 :Int = (v1 * time) + g
        //    var distance2 :Int = v2 * time
          //  var difference :Int = distance1 - distance2
            //if "difference" is 0:
            //diffFlag == true
            //var time = time + 1
            //break
    //} }


    return intArrayOf()
}