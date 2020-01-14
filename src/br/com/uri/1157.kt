package br.com.uri

fun main() {
    val n = (readLine() ?: return).toInt()
    for (i in 1..n) {
        if (n % i == 0) {
            println(i)
        }
    }
}

/*
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

Exemplo de Entrada	Exemplo de Saída
6

1
2
3
6*/
