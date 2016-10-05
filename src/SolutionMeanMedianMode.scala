object Solution {

    def main(args: Array[String]): Unit = {
        val num: Int = scala.io.StdIn.readInt // do not need for Scala.
        val xs: List[Int] = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList

        val sortedXs = sort(xs)

        println(findMean(sortedXs))
        println(findMedian(sortedXs))
        println(findMode(sortedXs))
    }

    def sort(list: List[Int]): List[Int] = {
        if(2 > list.legnth)
            list
        else {
            val pivot = list(list.length / 2)
            sort(list.filter(_ < pivot)) ::: list.filter(_ == pivot) ::: quick(list.filter(_ > pivot))   
        }
    }

    def findMean(xs: List[Int]): Double = {
        def sum(xs: List[Int]): Int = xs match {
            case Nil => 0
            case head :: tail => head + sum(tail)
        }
        (math rint (sum(xs) / xs.length) * 10) / 10
    }

    def findMedian(xs: List[Int]): Double = {
        (math rint xs(0) * 10) / 10
    }

    def findMode(xs: List[Int]): Double = {
        (math rint xs(0) * 10) / 10
    }
}
