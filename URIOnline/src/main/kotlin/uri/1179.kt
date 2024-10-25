package uri

import java.util.*

fun main() {
    val entrada = Scanner(System.`in`)
    val vetorPar = IntArray(5)
    val vetorImpar = IntArray(5)
    var auxPar = 0
    var auxImpar = 0

    repeat(15) {
        val x = entrada.nextInt()

        if (x % 2 == 0) {
            vetorPar[auxPar] = x
            auxPar++
        } else {
            vetorImpar[auxImpar] = x
            auxImpar++
        }

        if ((auxImpar == 5) or (it == 14)) {
            for (i in 0 until auxImpar) {
                println("impar[$i] = " + vetorImpar[i])
            }
            auxImpar = 0
        }

        if ((auxPar == 5) or (it == 14)) {
            for (i in 0 until auxPar) {
                println("par[$i] = " + vetorPar[i])
            }
            auxPar = 0
        }
    }
}

/*
Neste problema você deverá ler 15 valores colocá-los
em 2 vetores conforme estes valores forem pares ou ímpares.
Só que o tamanho de cada um dos dois vetores é de 5 posições.
 Então, cada vez que um dos dois vetores encher, você deverá
 imprimir tod0 vetor e utilizá-lo novamente para os próximos
  números que forem lidos. Terminada a leitura, deve-se imprimir
 o conteúdo que restou em cada um dos
  dois vetores, imprimindo primeiro os
  valores do vetor impar. Cada vetor pode
   ser preenchido tantas vezes quantas for
    necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
1
3
4
-4
2
3
8
2
5
-7
54
76
789
23
98

par[0] = 4
par[1] = -4
par[2] = 2
par[3] = 8
par[4] = 2
impar[0] = 1
impar[1] = 3
impar[2] = 3
impar[3] = 5
impar[4] = -7
impar[0] = 789
impar[1] = 23
par[0] = 54
par[1] = 76
par[2] = 98*/
