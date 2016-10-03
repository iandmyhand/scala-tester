object Solution {

    def main(args: Array[String]) {
        scala.io.StdIn.readInt match {
            case n if (1 <= n && n <= 100) => n match {
                case n if 1 == n % 2 => println("Weird")
                case n if 2 until 5 contains n => println("Not Weird")
                case n if 6 until 20 contains n => println("Weird")
                case n if 20 < n => println("Not Weird")
                case _ => println("Weird")   
            }
            case _ => println("Weird")
        }
    }
}
