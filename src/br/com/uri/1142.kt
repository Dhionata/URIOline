package br.com.uri

fun main() {
    val n = 0 until ((readLine() ?: return).toInt())
    var x = 1
    repeat(n.count()) {
        println("$x ${x + 1} ${x + 2} PUM")
        x += 4
    }
}