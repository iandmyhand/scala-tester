object SolutionBubbleSort {
    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt
        val arr = scala.io.StdIn.readLine.split(" ").map{_.toInt}
        val numSwaps = bubbleSort(arr)
        println(s"Array is sorted in ${numSwaps} swaps.")
        println(s"First Element: ${arr(0)}")
        println(s"Last Element: ${arr(arr.length - 1)}")
    }

    def bubbleSort(arr: Array[Int]): Int = {
        var numSwaps = 0
        for(i <- 0 until arr.length) {
            for(j <- 0 until arr.length - 1) {
                if(arr(j) > arr(j + 1)) {
                    swap(j, j + 1, arr)
                    numSwaps += 1
                }
            }
        }
        numSwaps
    }

    def swap(i: Int, j: Int, arr: Array[Int]): Unit = {
        val t = arr(j)
        arr(i) = arr(j)
        arr(j) = t
    }
}