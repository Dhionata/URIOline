package br.com.uri

fun main() {
    val x = (readLine() ?: return).toInt()
    val y = (readLine() ?: return).toInt()
    if (x < y) {
        for (i in x + 1 until y) {
            //println("Indice: $i")
            if (i % 5 == 2 || i % 5 == 3) {
                println(i)
            }
        }
    } else {
        val lista = mutableListOf<Int>()
        for (i in x - 1 downTo y + 1) {
            //println("Indice: $i")
            if (i % 5 == 2 || i % 5 == 3) {
                lista.add(i)
            }
        }
        lista.sort()
        for (i in lista) {
            println(i)
        }
    }
}
/*
Escreva um programa que leia 2 valores X e Y e
que imprima todos os valores entre eles cujo
resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos
inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo
abaixo, sempre em ordem crescente.

Sample Input	Sample Output
10
18

12
13
17*/



