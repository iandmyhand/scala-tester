object SolutionGenerics {
    def main(args: Array[String]): Unit = {
        val is = Array(1, 2, 3)
        val ss = Array("A", "B", "C")
        printArray(is)
        printArray(ss)
    }

    def printArray(arr: Array[_]): Unit = {
        for(n <- 0 until arr.length) {
            println(arr(n).toString)
        }
    }
}