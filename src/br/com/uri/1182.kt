package br.com.uri

fun main() {
    val matriz = Array(12) { DoubleArray(12) }
    val coluna = readLine()!!.toInt()
    val operacao = readLine()
    var soma = 0.0

    for (auxLinha in matriz.indices) {
        for (auxColuna in matriz.indices) {
            matriz[auxLinha][auxColuna] = readLine()!!.toDouble()
            if (auxColuna == coluna) {
                soma += matriz[auxLinha][coluna]
            }
        }
    }
    when (operacao) {
        "S" -> println("%.1f".format(soma))
        "M" -> println("%.1f".format(soma / matriz.size))
    }
}
/*
Neste problema você deve ler um número que indica uma
coluna de uma matriz na qual uma operação deve ser realizada,
um caractere maiúsculo, indicando a operação que será realizada,
e todos os elementos de uma matriz M[12][12]. Em seguida,
calcule e mostre a soma ou a média dos elementos que estão
 na área verde da matriz, conforme for o caso. A imagem abaixo
 ilustra o caso da entrada do valor 5 para a coluna da matriz,
 demonstrando os elementos que deverão ser considerados na operação.




Entrada
A primeira linha de entrada contem um número C (0 ≤ C ≤ 11)
 indicando a coluna que será considerada para operação. A segunda
 linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'),
  indicando a operação (Soma ou Média) que deverá ser realizada
  com os elementos da matriz. Seguem os 144 valores de ponto
  flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após
o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
5
S
0.0
-3.5
2.5
4.1
...*/
