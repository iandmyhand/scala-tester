object Solution {

    class Person {
        var age: Int = 0

        def this(initialAge: Int) = {
            this()
            initialAge match {
                case age if 0 > age => println("Age is not valid, setting age to 0."); this.age = 0
                case _ => this.age = initialAge
            }
        }

        def amIOld(): Unit = {
            this.age match {
                case age if 13 > age => println("You are young.")
                case age if 13 <= age && age < 18 => println("You are a teenager.")
                case _ => println("You are old.")
            }
        }

        def yearPasses(): Unit = {
            this.age += 1
        }
    }

    def main(args: Array[String]): Unit = {
        val T = scala.io.StdIn.readInt
        var i = 0
        for(i <- 1 to T) {
            val age = scala.io.StdIn.readInt
            val p = new Person(age)
            p.amIOld()
            var j = 0
            for(j <- 1 to 3) {
                p.yearPasses()
            }
            p.amIOld()
            println()
        }
    }

}
