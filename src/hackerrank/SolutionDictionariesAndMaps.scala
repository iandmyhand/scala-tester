import scala.collection.concurrent.TrieMap

object Solution {
        
    def query(phoneBook: TrieMap[String, String]) {
        while(true) {
            scala.io.StdIn.readLine match {
                case q: String if null != q && !q.isEmpty => {
                    phoneBook.getOrElse(q, None) match {
                        case None => println("Not found")
                        case s => println(q + "=" + s)
                    }
                }
                case _ => return
            }
        }
    }

    def main(args: Array[String]): Unit = {
        val phoneBook = new TrieMap[String, String]
        for(i <- 1 to scala.io.StdIn.readInt) {
            val pair = scala.io.StdIn.readLine.split(" ")
            phoneBook += (pair(0) -> pair(1))
        }
        query(phoneBook)
    }

}
