package br.com.uri

/**
 *
 */
fun main() {
    //println("Informe o valor de repetições")
    val n = 0 until (readLine() ?: return).toInt()
    var dentro = 0
    var fora = 0
    mutableListOf<Int>()

    n.forEach { _ ->
        //println("Informe o valor da posição ${it + 1}")
        val x = readLine()?.toInt()

        if (x in 10..20) {
            dentro += 1
            // println("Dentro: $dentro")
        } else {
            fora += 1
            //println("Fora: $fora")
        }
    }
    println("$dentro in\n$fora out")
}

/*Leia um valor inteiro N.
Este valor será a quantidade de valores inteiros X que serão lidos em seguida.*/
/*
Mostre quantos destes valores X estão dentro do intervalo [10,20] e
quantos estão fora do intervalo, mostrando essas informações.*/
