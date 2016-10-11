import scala.collection.mutable.Stack
import scala.collection.mutable.Queue

class SolutionQueuesAndStacks(private val s: Stack[Char] = new Stack,
                              private val q: Queue[Char] = new Queue) {

    def pushCharacter(ch: Char): Unit = {
        s.push(ch)
    }

    def enqueueCharacter(ch: Char): Unit = {
        q.enqueue(ch)
    }

    def popCharacter: Char = {
        s.pop
    }

    def dequeueCharacter: Char = {
        q.dequeue
    }

}

object SolutionQueuesAndStacks {
    
    def main(args: Array[String]): Unit = {
        // create the Solution class object.
        var obj = new SolutionQueuesAndStacks()
        val s = scala.io.StdIn.readLine
        
        // push/enqueue all the characters of string s to stack.
        s map {
            c => {
                obj.pushCharacter(c)
                obj.enqueueCharacter(c)
            }
        }
      
        /* pop the top character from stack
           dequeue the first character from queue
           compare both the characters. */
        def isPalindrome(solution: SolutionQueuesAndStacks): Boolean = {
            while(true) {
                try{
                    if(solution.popCharacter != solution.dequeueCharacter) {
                        return false
                    }
                }
                catch {
                    case e: NoSuchElementException => return true
                }
            }
            return true
        }

        if(isPalindrome(obj)) {
            println("The word, "+s+", is a palindrome." )
        } 
        else {
            println("The word, "+s+", is not a palindrome." )
        }
    }

}
