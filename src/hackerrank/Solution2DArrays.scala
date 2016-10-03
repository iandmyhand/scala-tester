import scala.collection.mutable.ArrayBuffer

/*
input:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
*/

object Solution {

    def main(args: Array[String]) {
        // Creating 2 dimensional array.
        def creatArrayBuffer(): Array[Array[Int]] = {
            var n = 0
            val arrayBuffer1 = new ArrayBuffer[Array[Int]]()
            while(true) {
                if(5 < n) return arrayBuffer1.toArray
                val arrayBuffer2 = new ArrayBuffer[Int]    
                scala.io.StdIn.readLine match {
                    case line:String if line != "" => line.split(" ") foreach {
                        i => arrayBuffer2 += i.toInt
                    }
                    case _ => return arrayBuffer1.toArray
                }
                arrayBuffer1 += arrayBuffer2.toArray
                n += 1
            }
            return arrayBuffer1.toArray
        }

        val array2d = creatArrayBuffer
        
        // Finding largest hourglass sum.
        var largestHourglassSum = -9 * 7 - 1
        for(i <- 0 until (array2d.length - 2)) {
            for(j <- 0 until (array2d(i).length - 2)) {
                var hourglassSum = 0
                hourglassSum += array2d(i)(j)
                hourglassSum += array2d(i)(j+1)
                hourglassSum += array2d(i)(j+2)
                hourglassSum += array2d(i+1)(j+1)
                hourglassSum += array2d(i+2)(j)
                hourglassSum += array2d(i+2)(j+1)
                hourglassSum += array2d(i+2)(j+2)
                if(largestHourglassSum < hourglassSum) {
                    largestHourglassSum = hourglassSum
                }
            }        
        }
        
        println(largestHourglassSum)
    }
}
