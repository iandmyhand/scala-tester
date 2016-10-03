object Solution {

    def factorial(n: Int): Int = {
        n match {
            case 1 => 1
            case x => x * factorial(x - 1)
        }
    }

    def main(args: Array[String]): Unit = {
        println(factorial(scala.io.StdIn.readInt))
    }

}
