package uri

import kotlin.math.pow

fun main() {
    val n = 1..(readLine() ?: return).toInt()
    n.forEach {
        println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")
        println(
            "$it ${(it.toDouble().pow(2.0) + 1).toInt()} ${
                (it.toDouble().pow
                    (3) + 1).toInt()
            }"
        )
    }
}
