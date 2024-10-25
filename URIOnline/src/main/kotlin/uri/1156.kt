package uri

fun main() {
    var denominador = 1f
    var divisor = 1f
    var s = 1f
    while (denominador < 39f) {
        denominador += 2f
        divisor *= 2f
        s += denominador / divisor
    }
    println("%.2f".format(s))
}
/*
Escreva um algoritmo para calcular e
escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o pont
 decimal.*/
