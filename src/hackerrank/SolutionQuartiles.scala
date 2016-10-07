object Solution {

    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt
        val quartilesX = quartiles(sort(scala.io.StdIn.readLine.split(" ").map(_.toInt).toList))
        println(quartilesX._1)
        println(quartilesX._2)
        println(quartilesX._3)
    }

    def sort(x: List[Int]): List[Int] = {
        if(2 > x.length)
            x
        else {
            val pivot = x(x.length / 2)
            sort(x.filter(_ < pivot)) ::: x.filter(_ == pivot) ::: sort(x.filter(_ > pivot))
        }
    }

    def quartiles(x: List[Int]): Tuple3[Int, Int, Int] = {
        isEven(x.length) match {
            case true => (median(x take (x.length / 2)), median(x), median(x drop (x.length / 2)))
            case _ => (median(x take (x.length / 2)), median(x), median(x drop (x.length / 2 + 1)))
        }
    }

    def isEven(x: Int): Boolean = {
        if(x % 2 == 0)
            true
        else
            false
    }

    def median(x: List[Int]): Int = {
        isEven(x.length) match {
            case true => ((x(x.length / 2 - 1) + x(x.length / 2)) / 2)
            case _ => (x(x.length / 2))
        }
    }

}
