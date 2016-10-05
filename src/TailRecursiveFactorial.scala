object TailRecursiveFactorial {

    // Not tail recursive
    def factorial_not_tailrec(n: Int): Int = {
        if (n < 2) n else factorial(n - 1) * n
    }

    // Tail recursive
    def factorial_tailrec(n: Int, res: Int): Int = {
        if (n < 2) res else factorial_tailrec(n - 1, n * res)
    }

    // Tail recursive with a HELP function
    def factorial(n: Int): Int = {
        def factorial_helper(n: Int, res: Int): Int = {
            if (n < 2) res else factorial_helper(n - 1, n * res)
        }
        factorial_helper(n, 1)
    }

    def main(args: Array[String]): Unit = {
        println(factorial_not_tailrec(5))
        println(factorial_tailrec(5, 1))
        println(factorial(5))
    }
}

/*
5 - 1, 5 * 1
4 - 1, 4 * 5
3 - 1, 3 * 4 * 5
2 - 1, 2 * 3 * 4 * 5
*/