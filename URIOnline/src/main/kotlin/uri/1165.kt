package uri

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    repeat(n) {
        val x = readLine()!!.toInt()
        if (x == 1 || x == 2) {
            println("$x eh primo")
        } else if (x % 2 != 0) {
            var aux = 0
            for (i in 1..(x / 2)) {
                if (x % i == 0) {
                    aux++
                }
                if (aux == 2) {
                    println("$x nao eh primo")
                    break
                }
            }
            if (aux == 1) {
                println("$x eh primo")
            }
        } else {
            println("$x nao eh primo")
        }
    }
}
/*
Na matemática, um Número Primo é aquele que
pode ser dividido somente por 1 (um) e po
 ele mesmo. Por exemplo, o número 7 é primo
  pois pode ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste.
A primeira linha da entrada contém um inteiro
N (1 ≤ N ≤ 100), indicando o número
de casos de teste da entrada. Cada uma das
N linhas seguintes contém um valor inteiro X
(1 < X ≤ 107), que pode ser ou não, um número
primo.

Saída
Para cada caso de teste de entrada, imprima a
mensagem “X eh primo” ou “X nao eh primo”, de
acordo com a especificação fornecida.

Exemplo de Entrada	Exemplo de Saída
3
8
51
7

8 nao eh primo
51 nao eh primo
7 eh primo*/
