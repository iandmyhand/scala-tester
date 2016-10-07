import scala.annotation.tailrec

object SolutionMain {

    class Node(val data: Int, var next: Option[Node])

    class Solution {

        def display(head: Option[Node]): Unit = {
            var current = head
            while(None != current) {

                print(current.get.data + " ")
                current = current.get.next
            }
        }

        def insert(head: Option[Node], data: Int): Option[Node] = {
            if(None == head)
                Option(new Node(data, None))
            else {
                tail(head).get.next = Option(new Node(data, None))
                head
            }
        }

        @tailrec
        private def tail(head: Option[Node]): Option[Node] = {
            if(None == head.get.next)
                head
            else
                tail(head.get.next)
        }

    }
    
    def main(args: Array[String]): Unit = {
        val mylist = new Solution()
        var head: Option[Node] = None

        for(n <- 0 until scala.io.StdIn.readInt) {
            head = mylist.insert(head, scala.io.StdIn.readInt)
        }
        mylist.display(head)
    }

}
