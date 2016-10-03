import scala.collection.mutable.ArrayBuffer

object Solution {

    def getQuotientAndRemainder(x: Int, y: Int): (Int, Int) = {
        (x / y, x % y)
    }

    def getBinaryNumbers(n: Int): String = {
        getQuotientAndRemainder(n, 2) match {
            case (0, y) => y.toString
            case (1, y) => "1" + y.toString
            case (x, y) => getBinaryNumbers(x) + y.toString
        }
    }
    
    def main(args: Array[String]): Unit = {
        var maxCount = 0
        getBinaryNumbers(scala.io.StdIn.readInt) foreach { n => if('1' == n) maxCount += 1 }
        println(maxCount.toString)
    }

}
