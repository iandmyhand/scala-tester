class Node(val data: Int, var left: Option[Node] = None, var right: Option[Node] = None)

object SolutionBTS {
    def main(args: Array[String]): Unit = {
        var cur: Option[Node] = None
        for(n <- 0 until scala.io.StdIn.readInt) {
            val data = scala.io.StdIn.readInt
            cur = insert(cur, data)
        }
        println(getHeight(cur))
    }

    def insert(root: Option[Node], data: Int): Option[Node] = {
        if(None == root){
            Option(new Node(data))
        } 
        else {
            if(root.get.data >= data) {
                root.get.left = insert(root.get.left, data)
            }
            else {
                root.get.right = insert(root.get.right, data)
            }
            root
        }
    }

    def getHeight(root: Option[Node]): Int = {
        def getHeightHelper(node: Option[Node], height: Int): Int = {
            if(None == node.get.left && None == node.get.right) {
                height
            }
            else {
                if(None != node.get.left && None == node.get.right) {
                    getHeightHelper(node.get.left, height + 1)
                } 
                else if(None == node.get.left && None != node.get.right) {
                    getHeightHelper(node.get.right, height + 1)
                }
                else {
                    (getHeightHelper(node.get.left, height + 1), getHeightHelper(node.get.right, height + 1)) match {
                        case (leftHeight, rightHeight) if leftHeight >= rightHeight => leftHeight
                        case (leftHeight, rightHeight) => rightHeight
                    }
                }
            }
        }
        getHeightHelper(root, 0)
    }
}