object Solution {

    def main(args: Array[String]): Unit = {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val mealCost: Double = scala.io.StdIn.readDouble
        val tipPercent: Long = scala.io.StdIn.readLong
        val taxPercent: Long = scala.io.StdIn.readLong
        val tip: Double = mealCost * tipPercent / 100
        val tax: Double = mealCost * taxPercent / 100
        val totalCost: Double = mealCost + tip + tax
        println("totalCost".r.replaceAllIn("The total meal cost is totalCost dollars.", (math round totalCost).toString))
    }
}
