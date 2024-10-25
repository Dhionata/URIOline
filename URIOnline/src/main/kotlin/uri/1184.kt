package uri

fun main(args: Array<String>) {
    val matriz = Array(12) { DoubleArray(12) }
    val operacao = readLine()
    var soma = 0.0

    for (linha in matriz.indices) {
        for (coluna in matriz.indices) {
            matriz[linha][coluna] = readLine()!!.toDouble()
            if (coluna < linha) {
                soma += matriz[linha][coluna]
            }
        }
    }
    when (operacao) {
        "S" -> println("%.1f".format(soma))
        "M" -> println("%.1f".format(soma / 66))
    }
}
