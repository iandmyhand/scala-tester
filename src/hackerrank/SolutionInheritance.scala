object Solution {

    class Person(protected val firstName: String, 
                 protected val lastName: String, 
                 protected val idNumber: Int) {

        def printPerson: Unit = {
            println(s"Name: ${lastName}, ${firstName}")
            println(s"ID: ${idNumber}")
        }

    }

    class Student(protected override val firstName: String, 
                  protected override val lastName: String, 
                  protected override val idNumber: Int,
                  protected val testScores: Array[Int]) extends Person(firstName, lastName, idNumber) {

        def calculate: Char = {
            val sum = testScores.foldLeft(0) {
                (x, y) => x + y
            }
            sum / testScores.length match {
                case average if 90 <= average && average <= 100 => 'O'
                case average if 80 <= average && average < 90 => 'E'
                case average if 70 <= average && average < 80 => 'A'
                case average if 55 <= average && average < 70 => 'P'
                case average if 40 <= average && average < 55 => 'D'
                case _ => 'T'
            }

        }

    }

    def main(args: Array[String]): Unit = {
        val studentInfo = scala.io.StdIn.readLine.split(" ")
        val numOfScores = scala.io.StdIn.readInt
        val scores = scala.io.StdIn.readLine.split(" ") map { score => score.toInt }
        val student = new Student(studentInfo(0), studentInfo(1), studentInfo(2).toInt, scores)
        student.printPerson
        println("Grade: " + student.calculate)
    }

}
