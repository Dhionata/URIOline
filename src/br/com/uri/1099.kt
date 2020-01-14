package br.com.uri

fun main() {
    val n = (readLine() ?: return).toInt()
    repeat(n) {
        val linha = (readLine() ?: return).split(" ")
        val x = (linha.min() ?: return@repeat).toInt()
        val y = (linha.max() ?: return@repeat).toInt()
        var totalImpares = 0

        for (i in x + 1 until y) {
            if (i % 2 == 1) {
                totalImpares += i
            }
        }
        println(totalImpares)
    }
}