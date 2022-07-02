import java.util.*

object BalancedBrackets {
    fun areBracketsBalanced(expr: String): Boolean {
        val stack: Deque<Char> = ArrayDeque()

        for (i in 0 until expr.length) {
            val x = expr[i]
            if (x == '(' ) {
                stack.push(x)
                continue
            }


            if (stack.isEmpty()) return false
            var check: Char
            when (x) {
                ')' -> {
                    check = stack.pop()
                    if (check == '{' ) return false
                }
                '}' -> {
                    check = stack.pop()
                    if (check == '(' ) return false
                }
                ']' -> {
                    check = stack.pop()
                    if (check == '(' ) return false
                }
            }
        }

        return stack.isEmpty()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val expr = "())()"

        if (areBracketsBalanced(expr)) println("Balanced ") else println("Not Balanced ")
    }
}