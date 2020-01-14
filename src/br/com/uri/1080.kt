package br.com.uri

fun main() {
    var x: Int
    var maximo = 0
    var posicao = 0
    var i = 1
    while (i < 101) {
        x = (readLine() ?: return).toInt()
        if (x > maximo) {
            maximo = x
            posicao = i
        }
        i++
    }
    println(maximo)
    println(posicao)
}

/*
Leia 100 valores inteiros. Apresente então o maior valor
lido e a posição dentre os 100 valores lidos.
Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.
Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
Exemplo de Entrada	Exemplo de Saída
2
113
45
34565
6
...
8


34565
4*/
