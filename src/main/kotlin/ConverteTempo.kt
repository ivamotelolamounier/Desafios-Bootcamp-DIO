/**
 *  Básico
 *  Princípios Básicos
 *  Desafio
 *  Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos
 *  de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.
 *  Entrada: O arquivo de entrada contém um valor inteiro N.
 *  Saída: Imprima o tempo lido no arquivo de entrada (segundos), convertido para
 *  horas:minutos:segundos, conforme exemplo fornecido.
 *  Exemplo de Entrada 	Exemplo de Saída
 *  556                 0:9:16
 *  1                   0:0:1
 */

import java.util.*

//implemente aqui sua solução para este desafio
fun main(arg: Array<String>) {
    val entrada = Scanner(System.`in`)
    val tempo = entrada.nextInt()

    val horas = (tempo / 3600)
    val minutos = ((tempo % 3600) / 60)
    val segundos = ((tempo % 3600) % 60)

    println("$horas:$minutos:$segundos")
}