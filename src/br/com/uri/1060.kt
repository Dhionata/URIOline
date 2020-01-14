package br.com.uri

fun main() {
    var total = 0
    repeat(6) {
        val x = (readLine() ?: return).toFloat()
        if (x > 0) {
            total += 1
        }
    }
    println("$total valores positivos")
}
/*
Faça um programa que leia 6 valores. Estes valores
serão somente negativos ou positivos (desconsidere os valores nulos).
A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.

Exemplo de Entrada	Exemplo de Saída
7
-5
6
-3.4
4.6
12

4 valores positivos*/
