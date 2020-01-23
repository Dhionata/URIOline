package br.com.uri

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    val x = entrada.nextInt()
    val y = entrada.nextInt()
    var valores = 0
    if (x < y) {
        for (impar in x + 1 until y) {
            if (impar % 2 != 0) {
                valores += impar
            }
        }
    } else if (x > y) {
        for (impar in x - 1 downTo y + 1) {
            if (impar % 2 != 0) {
                valores += impar
            }
        }
    }
    println(valores)
}
/*
Leia 2 valores inteiros X e Y. A seguir,
calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este
valor é a soma dos valores ímpares que estão entre
os valores fornecidos na entrada que deverá caber em
um inteiro.

Exemplo de Entrada	Exemplo de Saída
6
-5

5

15
12

13

12
12

0*/
