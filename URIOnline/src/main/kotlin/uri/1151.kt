package uri

fun main() {
    val n = (readLine() ?: return).toLong()
    fibIterativo(n)
}

fun fibIterativo(n: Long): Long {
    var j: Long = 1
    var i: Long = 0
    var t: Long
    print("0 ")
    for (k in 1 until n) {
        t = i + j
        i = j
        j = t
        if (k != n - 1) {
            print("$i ")
        } else {
            print(i)
        }
    }
    println()
    return j
}

/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21...
é conhecida como série de Fibonacci. Nessa sequência,
cada número, depois dos 2 primeiros, é igual à soma
dos 2 anteriores. Escreva um algoritmo que leia um
inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha,
separados por um espaço em branco. Não deve haver
espaço após o último valor.

Exemplo de Entrada	Exemplo de Saída
5

0 1 1 2 3*/
