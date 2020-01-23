package br.com.uri

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    val n = entrada.nextInt()
    var x = 1
    for (i in 0 until n) {
        println("$x ${x + 1} ${x + 2} PUM")
        x += 4
    }
}