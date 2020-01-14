package br.com.uri

fun main() {
    val n = (readLine() ?: return).toInt()
    repeat(n) {
        val xy = (readLine() ?: return@repeat).split(" ")
        var x = xy[0].toInt()
        val y = xy[1].toInt()
        var soma = 0
        var aux = 0

        while (aux < y) {
            if (x % 2 != 0) {
                soma += x
                aux++
            }
            x++
        }
        println(soma)
    }
}

/*val n: Int
var x: Int
var y: Int
var j: Int
var total: Int
val input = Scanner(System.`in`)
n = input.nextInt()

repeat(n) {
    var soma = 0
    x = input.nextInt()
    y = input.nextInt()
    j = x
    total = 0
    while (total < y) {
        if (j % 2 != 0) {
            soma += j
            total++
        }
        j++
    }
    print(soma.toString() + "\n")
}
}*/
/*
Leia um valor inteiro N que é a quantidade
de casos de teste que vem a seguir. Cada
caso de teste consiste de dois inteiros X e Y.
Você deve apresentar a soma de Y ímpares
consecutivos a partir de X inclusive o
próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45,
que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40,
que é equivalente à: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada é um inteiro
N que é a quantidade de casos de teste que
vem a seguir. Cada caso de teste consiste
em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma dos consecutivos números
ímpares a partir do valor X.

Exemplo de Entrada	Exemplo de Saída
2
4 3
11 2

21
24*/
