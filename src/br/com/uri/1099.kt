package br.com.uri

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    val n = entrada.nextInt()
    repeat(n) {

        val x = entrada.nextInt()
        val y = entrada.nextInt()
        var totalImpares = 0

        if (x < y) {
            for (impar in x + 1 until y) {
                if (impar % 2 != 0) {
                    totalImpares += impar
                }
            }
        } else if (x > y) {
            for (impar in x - 1 downTo y + 1) {
                if (impar % 2 != 0) {
                    totalImpares += impar
                }
            }
        }
        println(totalImpares)
    }
}

/*
Leia um valor inteiro N que é a quantidade de casos de
teste que vem a seguir. Cada caso de teste consiste de
dois inteiros X e Y. Você deve apresentar a soma de todos
 os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a
quantidade de casos de teste que vem a seguir. Cada
caso de teste consiste em uma linha contendo dois inteiros
 X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.

Exemplo de Entrada	Exemplo de Saída
7

4 5

13 10

6 4

3 3

3 5

3 4

3 8

0

11

5

0

0

0

12*/
