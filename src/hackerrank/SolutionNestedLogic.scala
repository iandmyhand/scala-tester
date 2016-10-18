object SolutionNestedLogic {
    def main(args: Array[String]): Unit = {
        val actualInputs = scala.io.StdIn.readLine.split(" ").map(_.toInt)
        val actualDay = actualInputs(0)
        val actualMonth = actualInputs(1)
        val actualYear = actualInputs(2)
        val expectedInputs = scala.io.StdIn.readLine.split(" ").map(_.toInt)
        val expectedDay = expectedInputs(0)
        val expectedMonth = expectedInputs(1)
        val expectedYear = expectedInputs(2)

        if(expectedYear == actualYear) {
            if(expectedMonth == actualMonth) {
                if(expectedDay >= actualDay) {
                    println(0)
                }
                else {
                    println(15 * (actualDay - expectedDay))
                }
            }
            else if(expectedMonth > actualMonth) {
                println(0)
            }
            else {
                println(500 * (actualMonth - expectedMonth))
            }
        }
        else if(expectedYear > actualYear) {
            println(0)
        }
        else {
            println(10000)
        }
    }
}