package br.com.uri

fun main() {
    val num = (readLine() ?: return).split(" ")
    val x = num[0].toInt()
    val y = num[1].toInt()

    for (i in 1..y) {
        print("$i")
        var oi = true
        if (i % x == 0) {
            println()
            oi = false
        }
        if (oi) {
            print(" ")
        }
    }
}
/*
Escreva um programa que leia dois valores X e Y.
A seguir, mostre uma sequência de 1 até Y, passando
para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros,
(1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha
apenas, com 1 espaço em branco entre cada número,
conforme exemplo abaixo. Não deve haver espaço em
branco após o último valor da linha.

Exemplo de Entrada	Exemplo de Saída
3 99

1 2 3
4 5 6
7 8 9
10 11 12
...
97 98 99*/
