package br.com.uri

fun main() {
    var i = 0.0
    var j = 1.0
    while (i <= 2.0) {
        when {
            i == 0.0 -> {
                println("I=${i.toInt()} J=${j.toInt()}")
                println("I=${i.toInt()} J=${(j + 1).toInt()}")
                println("I=${i.toInt()} J=${(j + 2).toInt()}")
            }

            i >= 1.9 -> {
                println("I=2 J=${j.toInt()}")
                println("I=2 J=${(j + 1).toInt()}")
                println("I=2 J=${(j + 2).toInt()}")
            }

            i == 1.0 -> {
                println("I=${i.toInt()} J=2")
                println("I=${i.toInt()} J=${(j + 1).toInt()}")
                println("I=${i.toInt()} J=${(j + 2).toInt()}")
            }

            else -> {
                println("I=${"%.1f".format(i)} J=${"%.1f".format(j)}")
                println("I=${"%.1f".format(i)} J=${"%.1f".format(j + 1)}")
                println("I=${"%.1f".format(i)} J=${"%.1f".format(j + 2)}")
            }
        }
        i += 0.2
        j += 0.2
    }
}
/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
Entrada
Não há nenhuma entrada neste problema.
Saída
Imprima a sequencia conforme exemplo abaixo.
Exemplo de Entrada	Exemplo de Saída
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?*/
