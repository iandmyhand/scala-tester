import scala.annotation.tailrec

class Node(val data: Int, var next: Option[Node] = None)

object SolutionLinkedListDeletion {
    def main(args: Array[String]): Unit = {
        var head: Option[Node] = None
        for(n <- 0 until scala.io.StdIn.readInt) {
            head = insert(head, scala.io.StdIn.readInt)
        }
        head = removeDuplicates(head)
        display(head)
    }

    def insert(head: Option[Node], data: Int): Option[Node] = {
        @tailrec
        def tailRecursiveInsert(head: Option[Node], cur: Option[Node], data: Int): Option[Node] = {
            if(None == head) Option(new Node(data))
            else if(None == cur.get.next) {
                cur.get.next = Option(new Node(data))
                head
            } 
            else {
                tailRecursiveInsert(head, cur.get.next, data)
            }
        }

        tailRecursiveInsert(head, head, data)
    }

    def removeDuplicates(head: Option[Node]): Option[Node] = {
        // remove duplicates.
        @tailrec
        def toSet(resultSet: Set[Int], cur: Option[Node]): Set[Int] = {
            if(None == cur) resultSet
            else toSet(resultSet + cur.get.data, cur.get.next)
        }
        val set = toSet(Set[Int](), head)

        // sort List.
        def sort(list: List[Int]): List[Int] = {
            if(1 >= list.length) list
            else {
                val pivot = list(list.length / 2)
                sort(list.filter(_ < pivot)) ::: list.filter(_ == pivot) ::: sort(list.filter(_ > pivot))
            }
        }
        val sorted = sort(set.toList)

        // convert array to linked list.
        @tailrec
        def toLinkedList(todo: List[Int], index: Int, head: Option[Node], cur: Option[Node]): Option[Node] = {
            if(index >= todo.length) head
            else {
                cur.get.next = Option(new Node(todo(index)))
                toLinkedList(todo, index + 1, head, cur.get.next)
            }
        }
        val newHead = Option(new Node(sorted(0)))
        toLinkedList(sorted, 1, newHead, newHead)
    }

    def display(head: Option[Node]): Unit = {
        if(None == head) return
        else {
            print(s"${head.get.data} ")
            display(head.get.next)
        }
    }
}
