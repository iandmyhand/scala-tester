object Solution {
    
    def main(args: Array[String]): Unit = {
        val sList = List.fill(scala.io.StdIn.readInt)(scala.io.StdIn.readLine)
        for(indexL <- 0 to (sList.length - 1)) {
            val S = sList(indexL)
            var even = new String()
            var odd = new String()
            for(indexS <- 0 to (S.length - 1)) {
                (indexS + 1) % 2 match {
                    case 0 => odd += S(indexS)
                    case _ => even += S(indexS)
                }
            }
            println(even + " " + odd)
        }
    }

}
