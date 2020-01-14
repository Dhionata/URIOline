package br.com.uri

fun main() {
    do {
        var soma = 0
        val x = (readLine() ?: return).toInt()
        if (x == 0) {
            break
        } else {
            var aux = 0
            for (i in x..x + 10) {
                if (aux == 5) {
                    break
                } else if (i % 2 == 0) {
                    soma += i
                    aux++
                }
            }
            println(soma)
        }
    } while (x != 0)
}
/*
O programa deve ler um valor
inteiro X indefinidas vezes.
(O programa irá parar quando o valor de X for igual a 0).
Para cada X lido, imprima a soma dos 5 pares consecutivos
a partir de X, inclusive o X , se for par. Se o valor de
 entrada for 4, por exemplo, a saída deve ser 40, que
 é o resultado da operação: 4+6+8+10+12, enquanto que
 se o valor de entrada for 11, por exempo, a saída deve
  ser 80, que é a soma de 12+14+16+18+20.

Entrada
O arquivo de entrada contém muitos valores inteiros.
O último valor do arquivo é zero.

Saída
Imprima a saida conforme a explicação acima e o exemplo
 abaixo.

Exemplo de Entrada	Exemplo de Saída
4
11
0

40
80*/
