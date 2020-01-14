package br.com.uri

fun main() {
    val x = (readLine() ?: return).toInt()
    val y = (readLine() ?: return).toInt()
    var total = 0
    if (x < y) {
        for (i in x..y) {
            if (i % 13 != 0) {
                total += i
            }
        }
    } else {
        for (i in x downTo y) {
            if (i % 13 != 0) {
                total += i
            }
        }
    }
    println(total)
}
/*
Escreva um algoritmo que leia 2 valores inteiros
X e Y calcule a soma dos números que não são
múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros
quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis
por 13 entre os dois valores lidos na entrada,
inclusive ambos se for o caso.

Sample Input	Sample Output
100
200

13954*/
