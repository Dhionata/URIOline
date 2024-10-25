package uri

fun main() {
    val t = readLine()!!.toInt()
    var aux = 0

    val vetor = IntArray(1000)

    for (i in vetor.indices) {
        vetor[i] = aux
        aux++
        if (aux >= t) {
            aux = 0
        }
        println("N[$i] = ${vetor[i]}")
    }
}
/*
Faça um programa que leia um valor
T e preencha um vetor N[1000] com a
sequência de valores de 0 até T-1 repetidas
 vezes, conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x",
onde i é a posição do vetor e x é o valor armazenado
naquela posição.

Exemplo de Entrada	Exemplo de Saída
3

N[0] = 0
N[1] = 1
N[2] = 2
N[3] = 0
N[4] = 1
N[5] = 2
N[6] = 0
N[7] = 1
N[8] = 2
...*/
