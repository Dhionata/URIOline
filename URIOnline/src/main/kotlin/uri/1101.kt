package uri

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    while (true) {
        var soma = 0
        val m = entrada.nextInt()
        val n = entrada.nextInt()
        if (m <= 0 || n <= 0) {
            break
        }
        if (m > n) {
            for (i in n..m) {
                soma += i
                print("$i ")
            }
        } else if (m < n) {
            for (i in m..n) {
                soma += i
                print("$i ")
            }
        }
        println("Sum=$soma")
    }
}
/*
Leia um conjunto não determinado de pares
de valores M e N (parar quando algum dos
valores for menor ou igual a zero). Para cada
par lido, mostre a sequência do menor até o
 maior e a soma dos inteiros consecutivos
  entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não
determinado de valores M e N. A última linha
de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência
do menor até o maior e a soma deles, conforme
exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
5 2
6 3
5 0

2 3 4 5 Sum=14
3 4 5 6 Sum=18*/
