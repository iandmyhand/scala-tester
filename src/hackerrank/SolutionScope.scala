object Solution {
    
    class Difference(private val elements: List[Int]) {

        var maximumDifference: Int = 0

        def computeDifference(): Unit = {
            val sorted = sort(elements)
            maximumDifference = sorted(sorted.length - 1) - sorted(0)
        }

        def sort(list: List[Int]): List[Int] = {
            if(2 > list.length)
                list
            else {
                val pivot = list(list.length / 2)
                sort(list.filter(_ < pivot)) ::: list.filter(_ == pivot) ::: sort(list.filter(_ > pivot))
            }
        }

    }

    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt
        val difference = new Difference(scala.io.StdIn.readLine.split(" ").map(_.toInt).toList)
        difference.computeDifference
        println(difference.maximumDifference)
    }

}
