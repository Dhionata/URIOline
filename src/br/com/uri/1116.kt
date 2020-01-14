package br.com.uri

fun main() {
    val x = (readLine() ?: return).toInt()

    repeat(x) {
        val numeros = readLine()
        if (numeros != null) {
            val numero = numeros.split(" ")
            dividir(numero)
        }
    }
}

fun dividir(lista: List<String>) {
    val a = lista[0].toDouble()
    val b = lista[1].toDouble()

    if (b == 0.0) {
        println("divisao impossivel")
    } else {
        println(a / b)
    }
}