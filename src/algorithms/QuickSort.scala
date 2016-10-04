/*
 * Functional style quick sort: http://www.scala-lang.org/old/node/58.html
 */

object QuickSort {

    def sort(list: List[Int]): List[Int] = {
        if (list.length < 2)
            list
        else {
            val pivot = list(list.length / 2)
            sort(list.filter(_ < pivot)) ::: list.filter(_ == pivot) ::: sort(list.filter(_ > pivot))
        }
    }

    def main(args: Array[String]): Unit = {
        val array = scala.io.StdIn.readLine.split(" ") map { number => number.toInt }
        println(array)
        println(sort(array.toList))
    }

}
