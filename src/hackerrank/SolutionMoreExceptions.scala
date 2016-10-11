class Calculator {
    def power(n: Int, p: Int): Int = {
        if(0 > n || 0 > p)
            throw new Exception("n and p should be non-negative")
        def powerHelper(n: Int, p: Int, r: Int): Int = {
            if(1 > p)
                r
            else
                powerHelper(n, p - 1, r * n)
        }
        powerHelper(n, p, 1)
    }
}

object SolutionMoreExceptions {

    def main(args: Array[String]): Unit = {
        var T = scala.io.StdIn.readInt
        val calc = new Calculator
        while(0 < T) {
            val Array(n, p) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
            try {
                println(calc.power(n, p))
            } 
            catch {
                case e: Throwable => println(e.getMessage)
            }
            T -= 1
        }
        
    }
    
}
