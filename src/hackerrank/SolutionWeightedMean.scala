import scala.annotation.tailrec

object Solution {

    def main(args: Array[String]) = {
        val n = scala.io.StdIn.readInt
        println(
            (math rint 
                weightedMean(scala.io.StdIn.readLine.split(" ").map(_.toInt), 
                             scala.io.StdIn.readLine.split(" ").map(_.toInt))
                * 10)
            / 10
        )
    }

    def weightedMean(x: Array[Int], w: Array[Int]): Double = {
        
        @tailrec
        def weightedMeanHelper(x: Array[Int], w: Array[Int], index: Int, numerator: Int, denominator: Int): Double = {
            if(index == math.min(x.length, w.length))
                numerator / denominator.toDouble
            else
                weightedMeanHelper(x, w, index + 1, numerator + (x(index) * w(index)), denominator + w(index))
        }

        weightedMeanHelper(x, w, 0, 0, 0)
    }
    
}
