package uri

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    while (entrada.hasNext()) {
        val n = entrada.nextInt()
        val m = entrada.nextInt()
        println(fatorial(n) + fatorial(m))
    }
}

fun fatorial(x: Int): Long {
    var fatorial: Long = 1
    for (i in 1..x) {
        fatorial *= i
    }
    return fatorial
}

/*
Leia dois valores inteiros
M e N indefinidamente. A cada leitura,
calcule e escreva a soma dos fatoriais
de cada um dos valores lidos. Utilize uma
variável apropriada, pois cálculo pod
 resultar em um valor com mais de 15 dígitos.

Entrada
O arquivo de entrada contém vários
casos de teste. Cada caso contém dois
números inteiros M (0 ≤ M ≤ 20) e N (0 ≤ N ≤ 20).
O fim da entrada é determinado por eof.

Saída
Para cada caso de teste de entrada,
seu programa deve imprimir uma única
linha, contendo um número que é a soma
de ambos os fatoriais (de M e N).

Exemplo de Entrada	Exemplo de Saída
4 4
0 0
0 2

48
2
3*/
