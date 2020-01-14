package br.com.uri

/**
 *
 */
fun main() {
    //println("Informe a hora inicial")
    val horaInicial: Int? = readLine()?.toInt()
    // println("Informe o minuto Inicial")
    val minutoInicial: Int? = readLine()?.toInt()
    // println("Informe a hora final")
    val horaFinal: Int? = readLine()?.toInt()
    // println("Informe o minuto final")
    val minutoFinal: Int? = readLine()?.toInt()

    var horaFin = (horaFinal ?: return) - (horaInicial ?: return)
    if (horaFin < 0) {
        horaFin += 24
    }
    var minutoFin = (minutoFinal ?: return) - (minutoInicial ?: return)
    if (minutoFin < 0) {
        minutoFin += 60
        horaFin -= 1
    }
    when {
        minutoFin and horaFin == 0 -> println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
        else -> println("O JOGO DUROU $horaFin HORA(S) E $minutoFin MINUTO(S)")
    }
}

/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

Exemplo de Entrada	Exemplo de Saída
7 8 9 10

O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

7 7 7 7

O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)

7 10 8 9

O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)*/