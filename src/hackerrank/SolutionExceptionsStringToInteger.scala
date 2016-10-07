object Solution {

    def main(args: Array[String]): Unit = {
        try {
            println(scala.io.StdIn.readLine.toInt)
        } catch {
            case _: Throwable => println("Bad String")
        }
    }

}
