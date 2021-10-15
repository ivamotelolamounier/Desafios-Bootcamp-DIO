/**
 * Introdução a Programação com Kotlin
 * 2 / 3 - Média 3
 * Intermediário - Princípios Básicos
 * Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
 * correspondente às quatro notas de um aluno. Calcule a média com pesos
 * 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média
 * acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0,
 * imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0,
 * imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9,
 * inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
 *
 * No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
 * Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média
 * (some a pontuação do exame com a média anteriormente calculada e divida por 2),
 * e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.",
 * (caso a média tenha ficado 4.9 ou menos).
 * Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na
 * última linha uma mensagem "Media final: " seguido da média final para esse aluno.
 *
 * Entrada: A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.
 * Saída: Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser
 * impressas conforme a descrição do problema. Não esqueça de imprimir o enter após
 * o final de cada linha, caso contrário obterá "Presentation Error".
 * Exemplo de Entrada 	Exemplo de Saída
 * 2.0 4.0 7.5 8.0
 * 6.4                  Media:
 *                      5.4 Aluno em exame.
 *                      Nota do exame: 6.4
 *                      Aluno aprovado.
 *                      Media final: 5.9
 * 2.0 6.5 4.0 9.0
 *                      Media: 4.8
 *                      Aluno reprovado.
 * 9.0 4.0 8.5 9.0
 *                      Media: 7.3
 *                      Aluno aprovado.
 */

import java.util.*
import kotlin.math.round

/**
Função utilizada para arrendondar as casas decimais, confrome
entrada (round) na função 'Float.round()'
 */
private fun Float.round(decimal: Int): Float {
    var multiplicador = 1.0f
    repeat(decimal) {
        multiplicador *= 10
    }
    return round(this * multiplicador) / multiplicador
}

fun main(arg: Array<String>) {
    val p1 = 2
    val p2 = 3
    val p3 = 4
    val p4 = 1
    val entrada = Scanner(System.`in`)
    entrada.useLocale(Locale.ENGLISH)
    val n1 = entrada.nextFloat()
    val n2 = entrada.nextFloat()
    val n3 = entrada.nextFloat()
    val n4 = entrada.nextFloat()
    val media: Float
    val mediaPonderada = ((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) /
            (p1 + p2 + p3 + p4)
    var mediaPrint = mediaPonderada.round(1)
    println("Media: $mediaPrint")

    if (mediaPonderada >= 7) {
        println("Aluno aprovado.")
    }
    if (mediaPonderada < 5) {
        println("Aluno reprovado.")
    }
    if (mediaPonderada >= 5 && mediaPonderada < 6.9) {
        println("Aluno em exame.")
        val exame = entrada.nextFloat()
        val examePrint = exame.round(1)

        println("Nota do exame: $examePrint")
        media = (mediaPonderada + exame) / 2
        mediaPrint = media.round(1)

        if (media >= 5) {
            println("Aluno aprovado.")
        } else {
            println("Aluno reprovado")
        }
        println("Media final: $mediaPrint")
    }
}