package uri

fun main() {
    var s = 0f
    for (i in 1..100) {
        s += 1f / i
    }
    println("%.2f".format(s))
}

/*Escreva um algoritmo para calcular e escrever o
valor de S, sendo S dado pela fórmula:
S = 1 + 1/2 + 1/3 + … + 1/100

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída*/
