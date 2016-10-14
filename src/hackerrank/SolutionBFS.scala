import scala.collection.mutable.ArrayBuffer

class Node(val data: Int, var left: Option[Node] = None, var right: Option[Node] = None)

object SolutionBFS {
    def main(args: Array[String]): Unit = {
        var cur: Option[Node] = None
        for(n <- 0 until scala.io.StdIn.readInt) {
            cur = insert(cur, scala.io.StdIn.readInt)
        }
        levelOrder(cur)
    }

    def insert(root: Option[Node], data: Int): Option[Node] = {
        if(root == None) Option(new Node(data))
        else {
            data match {
                case data if (data <= root.get.data) => root.get.left = insert(root.get.left, data); root
                case data => root.get.right = insert(root.get.right, data); root
            }
        }
    }

    def levelOrder(root: Option[Node]): Unit = {

        def levelOrderHelper(nodes: Array[Option[Node]]): Unit = {
            if(1 > nodes.length) return
            val nextNodes = new ArrayBuffer[Option[Node]]
            nodes foreach { nodeOption => nodeOption match {
                case node: Option[Node] => {
                    print(s"${node.get.data} ")
                    if(None != node.get.left) {
                        nextNodes.append(node.get.left)
                    }
                    if(None != node.get.right) {
                        nextNodes.append(node.get.right)
                    }
                }
            }}
            levelOrderHelper(nextNodes.toArray)
        }
        levelOrderHelper(Array(root))
    }
}
