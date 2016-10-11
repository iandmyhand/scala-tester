import scala.annotation.tailrec

object Solution {

    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt
        var array = scala.io.StdIn.readLine.split(" ").map(_.toInt)
        sort(array)
        println(array.mkString(" "))
        val quartilesX = quartiles(array)
        println(quartilesX._1)
        println(quartilesX._2)
        println(quartilesX._3)
    }

    def sort(array: Array[Int]) {
        def swap(i: Int, j: Int) {
            val t = array(i)
            array(i) = array(j)
            array(j) = t
        }
        def quicksort(l: Int, r: Int) {
            val pivot = array((l + r) / 2)
            println(s"pivot:${pivot}")
            var i = l
            var j = r
            while(i <= j) {
                while(array(i) < pivot) i += 1
                while(array(j) > pivot) j -= 1
                if(i <= j) {
                    println(s"${i},${array(i)}\t|${j},${array(j)}")
                    swap(i, j)
                    i += 1
                    j -= 1
                }
            }
            println(array.mkString(" "))
            println(s"${l},${r},${i},${j}")
            if(l < j) quicksort(l, j)
            if(j < r) quicksort(i, r)
        }
        println(s"length:${array.length}")
        quicksort(0, array.length - 1)
    }

    @tailrec
    def sort2(todo: Array[Int], done: Array[Int]): Array[Int] = {
        if(1 > todo.length)
            done
        else {
            
        }
    }

    def quartiles(x: Array[Int]): Tuple3[Int, Int, Int] = {
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

    def median(x: Array[Int]): Int = {
        isEven(x.length) match {
            case true => ((x(x.length / 2 - 1) + x(x.length / 2)) / 2)
            case _ => (x(x.length / 2))
        }
    }

}
