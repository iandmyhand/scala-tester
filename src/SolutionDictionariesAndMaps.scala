import scala.collection.mutable.{Map, SynchronizedMap, HashMap}

object Solution {

    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt
        var phoneBook = new HashMap[String, String] with SynchronizedMap[String, String]
        for(i <- 1 to n) {
            val pair = scala.io.StdIn.readLine.split(" ")
            phoneBook += (pair(0) -> pair(1))
        }
        
        def query {
            while(true) {
                scala.io.StdIn.readLine match {
                    case q: String if "" != q => {
                        phoneBook.getOrElse(q, None) match {
                            case None => println("Not found")
                            case s => println(q + "=" + s)
                        }
                    }
                }
            }
        }

        query
    }

}
