package uri

import java.io.*
import java.util.*


fun main(args: Array<String>) {
    var `in`: FastScanner = FastScanner(System.`in`)
    var out = PrintWriter(System.out)
    val numDeCasos: Int = `in`.nextInt()
    var totalPessoas: Int
    var passos: Int
    for (i in 1..numDeCasos) {
        totalPessoas = `in`.nextInt()
        passos = `in`.nextInt()
        out.println("Case " + i + ": " + (josephus(totalPessoas, passos) + 1))
    }
    `in`.close()
    out.close()
}

private fun josephus(totalDePessoas: Int, passos: Int): Int {
    // Runtime error :/
    /* if (n == 1){
    return 0;
    }
    return (josephus(n - 1, m) + m) % n; */
    var aux = 0
    for (i in 2..totalDePessoas) {
        aux = (aux + passos) % i
    }
    return aux
}

class FastScanner(input: InputStream?) : Closeable {
    private val reader: BufferedReader = BufferedReader(InputStreamReader(input))
    private var tokenizer: StringTokenizer?

    operator fun next(): String? {
        while (tokenizer == null || !(tokenizer ?: return null).hasMoreTokens()) {
            val linha = reader.readLine() ?: return null
            tokenizer = StringTokenizer(linha)
        }
        return (tokenizer ?: return null).nextToken()
    }

    fun nextInt(): Int {
        return next()!!.toInt()
    }

    override fun close() {
        tokenizer = null
        reader.close()
    }

    init {
        tokenizer = StringTokenizer("")
    }
}

/*
A Lenda de Flavious Josephus
Por Neilor Tonin, URI  Brasil

Timelimit: 1
O problema de Josephus é assim conhecido
por causa da lenda de Flavius Josephus, um
historiador judeu que viveu no século 1.
Segundo o relato de Josephus do cerco de Yodfat,
ele e seus companheiros (40 soldados) foram presos
em uma caverna, cuja saída foi bloqueada pelos
romanos. Eles preferiram suicidar-se a serem capturados,
e decidiram que iriam formar um círculo e começar a
matar-se pulando de três em três. Josephus afirma
que, por sorte ou talvez pela mão de Deus, ele
permaneceu por último e preferiu entregar-se aos
romanos a suicidar-se.

Entrada
Haverá NC (1 ≤ NC ≤ 30 ) casos de teste. Em cada
caso de teste de entrada haverá um par de números
inteiros positivos n (1 ≤ n ≤ 10000 ) e k (1 ≤ k ≤ 1000).
O  número n representa a quantidade de pessoas no círculo,
numeradas de 1 até n. O número k representa o tamanho do
salto de um homem até o próximo homem que será morto.

Segue um exemplo com 5 homens e um salto = 2.




Neste exemplo o elemento que restará após as eliminações é 3.
Saída
Para cada caso de teste de entrada será apresentada uma
linha de saída no seguinte formato: Case n: m tendo sempre
um espaço antes do n e do m.

Exemplo de Entrada	Exemplo de Saída
3
5 2
6 3
1234 233

Case 1: 3
Case 2: 1
Case 3: 25*/
