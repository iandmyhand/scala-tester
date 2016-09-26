object Solution {

    def main(args: Array[String]): Unit = {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        val num: Int = scala.io.StdIn.readInt
        val x: String = scala.io.StdIn.readLine
        val xs: List[Int] = x.split(" ").map(_.toInt).toList

        def sort(xs: List[Int]): List[Int] = {
            def quick(list: List[Int], pivot: Int, left: Int, right: Int) = {
                list.patch(5, Seq(0), 1)
                println(list(0))
                list
            }
            quick(xs, 0, 0, 0)
        }
        val sortedXs = sort(xs)

        println(findMean(sortedXs))
        println(findMedian(sortedXs))
        println(findMode(sortedXs))
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
