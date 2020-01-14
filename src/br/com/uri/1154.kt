package br.com.uri

fun main() {
    var mediaFinal = 0.0
    var i = 0
    do {
        val n = (readLine() ?: return).toInt()
        if (n >= 0) {
            mediaFinal += n
            i++
        }
    } while (n >= 0)
    println("%.2f".format(mediaFinal / i))
}

/*
Faça um algoritmo para ler um número
indeterminado de dados, contendo cada um,
a idade de um indivíduo. O último dado, que
não entrará nos cálculos, contém o valor de
idade negativa. Calcular e imprimir a idade
média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de
inteiros. A entrada será encerrada quando
um valor negativo for lido.

Saída
A saída contém um valor correspondente à
média de idade dos indivíduos.

A média deve ser impressa com dois dígitos
após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
34
56
44
23
-2

39.25*/
