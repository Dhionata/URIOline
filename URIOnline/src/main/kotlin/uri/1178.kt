package uri

import java.util.*

fun main() {
    val entrada = Scanner(System.`in`)
    val x = entrada.nextDouble()
    val vetor = DoubleArray(100)
    vetor[0] = x
    println("N[0] = ${"%.4f".format(vetor[0])}")
    for (i in 1 until 100) {
        vetor[i] = vetor[i - 1] / 2
        println("N[$i] = ${"%.4f".format(vetor[i])}")
    }
}
/*
Leia um valor X. Coloque este valor na
primeira posição de um vetor N[100]. Em
 cada posição subsequente de N (1 até 99),
 coloque a metade do valor armazenado na posição
 anterior, conforme o exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contem um valor de dupla precisão
com 4 casas decimais.

Saída
Para cada posição do vetor N, escreva "N[i] = Y",
onde i é a posição do vetor e Y é o valor armazenado
naquela posição. Cada valor do vetor deve ser apresentado
com 4 casas decimais.

Exemplo de Entrada	Exemplo de Saída
200.0000

N[0] = 200.0000
N[1] = 100.0000
N[2] = 50.0000
N[3] = 25.0000
N[4] = 12.5000
...*/
