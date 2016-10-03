
object Solution {

    def main(args: Array[String]): Unit = {
        val i: Int = 4
        val d: Double = 4.0
        val s: String = "HackerRank "

        /* Declare second integer, double, and String variables. */
        var i2: Int = 0;
        var d2: Double = 0.0
        var s2: String = ""

        /* Read and save an integer, double, and String to your variables.*/
        i2 = scala.io.StdIn.readInt
        d2 = scala.io.StdIn.readDouble
        s2 = scala.io.StdIn.readLine

        /* Print the sum of both integer variables on a new line. */
        println(i + i2)

        /* Print the sum of the double variables on a new line. */
        println(d + d2)
        
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        println(s + s2)
    }

}
