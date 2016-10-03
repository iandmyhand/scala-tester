object Solution {

    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt
        (scala.io.StdIn.readLine.split(" ") map { _.toInt } reverse) foreach { 
            x => print(x.toString + " ") 
        }
    }

}
