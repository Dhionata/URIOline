package br.com.uri

import java.util.*

fun main() {
    val n: Int
    var x: Int
    var total = 0
    var totalC = 0
    var totalR = 0
    var totalS = 0
    var totalCporcentagem = 0f
    var totalRporcentagem = 0f
    var totalSporcentagem = 0f
    var animalCaracter: String

    val input = Scanner(System.`in`)
    n = input.nextInt()

    for (i in 1..n) {
        x = input.nextInt()
        animalCaracter = input.next()
        total += x
        when (animalCaracter) {
            "C" -> {
                totalC += x
            }
            "R" -> {
                totalR += x
            }
            "S" -> {
                totalS += x
            }
        }
        totalCporcentagem = (totalC * 100.00 / total).toFloat()
        totalRporcentagem = (totalR * 100.00 / total).toFloat()
        totalSporcentagem = (totalS * 100.00 / total).toFloat()
    }
    println("Total: $total cobaias")
    println("Total de coelhos: $totalC")
    println("Total de ratos: $totalR")
    println("Total de sapos: $totalS")

    println("Percentual de coelhos: ${"%.2f".format(totalCporcentagem)} %")
    println("Percentual de ratos: ${"%.2f".format(totalRporcentagem)} %")
    println("Percentual de sapos: ${"%.2f".format(totalSporcentagem)} %")
}