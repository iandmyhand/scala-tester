object Solution {
    
    trait Book {
        val title: String
        val author: String
        def display(): Unit
    }

    class MyBook(override val title: String, override val author: String, val price: Int) extends Book {

        override def display(): Unit = {
            println(s"Title: ${title}")
            println(s"Author: ${author}")
            println(s"Price: ${price}")
        }

    }

    def main(args: Array[String]): Unit = {
        new MyBook(scala.io.StdIn.readLine, scala.io.StdIn.readLine, scala.io.StdIn.readInt).display
    }

}
