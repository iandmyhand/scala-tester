class Generics {
    def printArray[T](arr: Array[T]): Unit = {
        for(n <- 0 until arr.length) {
            println(arr(n).toString)
        }
    }
}

object SolutionGenerics {
    def main(args: Array[String]): Unit = {
        val is = Array(1, 2, 3)
        val ss = Array("A", "B", "C")
        printArray(is)
        printArray(ss)

        val g = new Generics
        g.printArray(is)
        g.printArray(ss)
    }

    def printArray(arr: Array[_]): Unit = {
        for(n <- 0 until arr.length) {
            println(arr(n).toString)
        }
    }
}