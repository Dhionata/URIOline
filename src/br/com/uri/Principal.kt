package br.com.uri

import javax.swing.JOptionPane

fun main() {
    println("olá mundo")
    println(somar(1))
    println(subtrair(1))
    val p = Pessoa("Dhionata", 19, false)

    p.casado = true

    JOptionPane.showMessageDialog(null, p.toString())

    p.nome = JOptionPane.showInputDialog("Informe seu nome!")
    p.idade = JOptionPane.showInputDialog("Informe sua idade").toInt()

    JOptionPane.showMessageDialog(null, p.toString())
}

private fun somar(a: Int): Int {
    return a + a
}

private fun subtrair(a: Int): Int {
    return a - a
}

class Pessoa(var nome: String, var idade: Int, var casado: Boolean) {
    override fun toString(): String {
        return "br.com.uri.Pessoa\nNome: '$nome'\n idade: $idade\ncasado: $casado"
    }
}


