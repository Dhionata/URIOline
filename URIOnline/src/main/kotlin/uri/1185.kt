package uri

import java.util.*

fun main() {
    val entrada = Scanner(System.`in`)
    val vetor = Array(12) { DoubleArray(12) }
    val operacao = entrada.next()
    var soma = 0.0

    for (linha in vetor.indices) {
        var aux2 = 11 - linha
        for (coluna in vetor.indices) {
            vetor[linha][coluna] = readLine()!!.toDouble()
            if (linha < aux2) {
                soma += vetor[linha][coluna]
                aux2--
            }
        }

    }
    when (operacao) {
        "S" -> println("%.1f".format(soma))
        "M" -> println("%.1f".format(soma / 66))
    }
}
