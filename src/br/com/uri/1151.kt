@file:Suppress("ProblematicWhitespace")

package br.com.uri

fun main() {
    val n = (readLine() ?: return).toLong()
    fibIterativo(n)
    /*tempoInicial = System.nanoTime()
    println("Fibonacci Recursivo: ${fibRecursivo(n)}\nTempo: ${System.nanoTime() - tempoInicial}\n")
    tempoInicial = System.nanoTime()
    println("Fibonacci Dividir para Conquistar: ${fibDividirParaConquistar(n)}" + "\nTempo: ${System.nanoTime() -
    tempoInicial}")*/
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
/*fun fibRecursivo(n: Long): Long {
	return when {
		n < 2 -> {
			n
		}
		else -> {
			fibRecursivo(n - 1) + fibRecursivo(n - 2)
		}
	}
}*/

/*fun fibDividirParaConquistar(n: Long): Long {
	if (n <= 0) {
		return 0
	}
	var i = n - 1
	var a: Long = 1
	var b: Long = 0
	var c: Long = 0
	var d: Long = 1
	var aux1: Long
	var aux2: Long

	while (i > 0) {
		if (i.toInt() % 2 != 0) {
			aux1 = d * b + c * a
			aux2 = d * (b + a) + c * b
			a = aux1
			b = aux2
		}
		aux1 = (c.toDouble().pow(2.0) + d.toDouble().pow(2.0)).toLong()
		aux2 = (d * (2 * c + d))
		c = aux1
		d = aux2
		i /= 2
	}
	return a + b
}*/

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