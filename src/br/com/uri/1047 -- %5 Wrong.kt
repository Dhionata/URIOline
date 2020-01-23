package br.com.uri

import java.util.*

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)

    val horaInicial = entrada.nextInt()
    val minutoInicial = entrada.nextInt()
    val horaFinal = entrada.nextInt()
    val minutoFinal = entrada.nextInt()

    var horasTotais = when {
        horaFinal > horaInicial -> horaFinal - horaInicial
        horaFinal == horaInicial -> 24
        else -> (24 - horaInicial) + horaFinal
    }

    val minutosTotais: Int

    when {
        minutoFinal > minutoInicial -> minutosTotais = minutoFinal - minutoInicial
        minutoFinal == minutoInicial -> minutosTotais = 0
        else -> {
            minutosTotais = (60 - minutoInicial) + minutoFinal
            horasTotais -= 1
        }
    }
    println("O JOGO DUROU $horasTotais HORA(S) E $minutosTotais MINUTO(S)")
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