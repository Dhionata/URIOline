package uri

import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
    val entrada = Scanner(System.`in`)
    while (entrada.hasNext()) {
        val n = entrada.nextInt()
        var max2 = 0
        (1..n).forEach { i ->
            val lesmasVelocidades = entrada.nextInt()
            max2 = when {
                lesmasVelocidades < 10 ->
                    max(max2, 1)

                lesmasVelocidades < 20 ->
                    max(max2, 2)

                else ->
                    max(max2, 3)
            }
        }
        println(max2)
    }
}
/*
A corrida de lesmas é um esporte que cresceu
 muito nos últimos anos, fazendo com que várias
  pessoas dediquem suas vidas tentando capturar
   lesmas velozes, e treina-las para faturar
    milhões em corridas pelo mundo. Porém a
    tarefa de capturar lesmas velozes não
    é uma tarefa muito fácil, pois praticamente
    todas as lesmas são muito lentas. Cada lesma
     é classificada em um nível dependendo de
      sua velocidade:

Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h
 e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .


Sua tarefa é identificar qual nível de velocidade
da lesma mais veloz de um grupo de lesmas.

Entrada
A entrada consiste de múltiplos casos de teste, e
cada um consiste em duas linhas: A primeira linha
contém um inteiro L (1 ≤ L ≤ 500) representando o
número de lesmas do grupo, e a segunda linha contém
L inteiros Vi (1 ≤ Vi ≤ 50) representando as
velocidades de cada lesma do grupo.

A entrada termina com o fim do arquivo (EOF).

Saída
Para cada caso de teste, imprima uma única linha
indicando o nível de velocidade da lesma mais veloz do grupo.

Exemplo de Entrada	Exemplo de Saída
10
10 10 10 10 15 18 20 15 11 10
10
1 5 2 9 5 5 8 4 4 3
10
19 9 1 4 5 8 6 11 9 7

3
1
2*/
