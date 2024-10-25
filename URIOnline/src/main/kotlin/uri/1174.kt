package uri

fun main(args: Array<String>) {
    val vetor = DoubleArray(100)

    vetor.indices.forEach {
        vetor[it] = readLine()!!.toDouble()
    }

    vetor.indices.forEach {
        if (vetor[it] <= 10) {
            println("A[$it] = ${"%.1f".format(vetor[it])}")
        }
    }
}
/*
Faça um programa que leia um vetor A[100].
No final, mostre todas as posições do vetor
 que armazenam um valor menor ou igual a 10
 e o valor armazenado em cada uma das posições.

Entrada
A entrada contém 100 valores, podendo ser
inteiros, reais, positivos ou negativos.

Saída
Para cada valor do vetor menor ou igual a 10,
escreva "A[i] = x", onde i é a posição do vetor
e x é o valor armazenado na posição, com uma
 casa após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
0
-5
63
-8.5
...

A[0] = 0.0
A[1] = -5.0
A[3] = -8.5
...*/
