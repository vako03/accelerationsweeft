internal object Main {

    fun totalWays(n: Int, m: Int): Int {

        if (n < 0) {
            return 0
        }


        if (n == 0) {
            return 1
        }
        var count = 0
        for (i in 1..m) {
            count += totalWays(n - i, m)
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 4
        val m = 3
        System.out.printf("%d steps are %d", n, m, totalWays(n, m))
    }
}
