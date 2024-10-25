package uri

import kotlin.math.pow

fun main() {
    val n = (readLine() ?: return).toInt()
    repeat(n) {
        println("${it + 1} ${((it + 1).toDouble().pow(2.0)).toInt()} ${((it + 1).toDouble().pow(3.0)).toInt()}")
    }
}

/*
Escreva um programa que leia um valor
inteiro N (1 < N < 1000). Este N é
a quantidade de linhas de saída que
serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número
inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
5

1 1 1
2 4 8
3 9 27
4 16 64
5 25 125*/
