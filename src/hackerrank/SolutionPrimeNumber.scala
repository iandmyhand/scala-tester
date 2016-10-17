import scala.annotation.tailrec

object SolutionPrimeNumber {
    def main(args: Array[String]): Unit = {
        for(n <- 0 until scala.io.StdIn.readInt) {
            isPrimeNumber(scala.io.StdIn.readInt) match {
                case true => println("Prime")
                case _ => println("Not prime")
            }
        }
    }

    def isPrimeNumber(n: Int): Boolean = {
        @tailrec
        def isPrimeNumber2(n: Int, divider: Int): Boolean = {
            if((n / 2) <= divider) true
            else if(0 != n % divider) isPrimeNumber2(n, divider + 2)
            else false
        }
        if(0 == n || 1 == n) false
        else if(2 == n) true
        else if(0 == n % 2) false
        else isPrimeNumber2(n, 3)
    }
}