object Solution {
    
    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt
        var i = 0
        var result = 0
        for (i <- 1 to 10) {
            def result = n * i
            var resultMessage = "{N} x {I} = {RESULT}"
            resultMessage = "\\{N\\}".r.replaceAllIn(resultMessage, n.toString)
            resultMessage = "\\{I\\}".r.replaceAllIn(resultMessage, i.toString)
            resultMessage = "\\{RESULT\\}".r.replaceAllIn(resultMessage, result.toString)
            println(resultMessage)
        }
    }

}
