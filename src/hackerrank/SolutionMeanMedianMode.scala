import scala.collection.concurrent.TrieMap

object Solution {

    def main(args: Array[String]) {
        val n = scala.io.StdIn.readInt
        val list = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
        val sorted = sort(list)

        println(mean(sorted))
        println(median(sorted))
        println(mode(sorted))
    }
    
    def sort(list: List[Int]): List[Int] = {
        if (2 > list.length)
            list
        else {
            val pivot = list(list.length / 2)
            sort(list.filter(_ < pivot)) ::: list.filter(_ == pivot) ::: sort(list.filter(_ > pivot))
        }
    }
    
    def mean(list: List[Int]): Double = {
        (math rint list.foldLeft(0){(x, y) => x + y} / list.length.toDouble * 10) / 10
    }
    
    def median(list: List[Int]): Double = {
        if (list.length % 2 == 0)
            (math rint (list(list.length / 2 - 1) + list(list.length / 2)) / 2.0 * 10) / 10
        else
            (math rint (list(list.length / 2) + list(list.length / 2 + 1)) / 2.0 * 10) / 10
    }
    
    def mode(list: List[Int]): Int = {
        var map = new TrieMap[Int, Int]
        list foreach {
            n => {
                val v = map.getOrElse(n, 0)
                if(0 == v)
                    map += (n -> 1)
                else
                    map += (n -> (v + 1))
            }
        }
        var mode = map.max
        if (mode._2 == 1)
            list(0)
        else
            mode._1
    }
    
}
