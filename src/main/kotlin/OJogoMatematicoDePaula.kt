/**
 * Desafios numéricos em Kotlin
 * 1 / 3 - O jogo Matemático de Paula
 * Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades
 * que a envolvam para brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados
 * assim por matemática e têm muita dificuldade para resolver as brincadeiras propostas por ela.
 * Agora Paula inventou um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra
 * e outro dígito numérico.
 * Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula,
 * deve-se somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar
 * o produto entre os dois dígitos. Ela pediu para seu amigo Marcelo, que é bom em programação, para
 * criar um programa para que encontre a solução para cada uma das sequências que Paula lhe apresentar.
 *
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N,
 * indicando o número de casos de teste que virão a seguir. Cada caso de teste é uma sequência de
 * três caracteres criada por Paula. Esta sequência contém na primeira posição um caractere de '0' a '9',
 * na segunda posição uma letra maiúscula ou minúscula do alfabeto e na terceira posição outro caractere
 * de '0' a '9'.
 *
 * Saída
 * Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução
 * da sequência proposta por Paula.
 *
 * Exemplo de Entrada 	Exemplo de Saída
 * 5
 * 4A5                  1
 * 3A3                  9
 * 4f2                  6
 * 2G4                  2
 * 7Z1                  -6
 */

fun main() {
    val N = readLine()!!.toInt()
    val listStr = mutableListOf<Int>()
    var list: List<String>
    var N1: Int
    var N2: Int
    var subtract: Int
    var product: Int
    var sum: Int

    for (i in 1..N) {
        list = readLine()!!.split(" ")

        for (i in list) {
            N1 = i.substring(2, 3).toInt()
            N2 = i.substring(0, 1).toInt()

            if (i.substring(0, 1) == i.substring(2, 3)) {
                product = N1.times(N2)
                listStr.add(product)
            }

            if (i.contentEquals(i.toLowerCase()) && N1 != N2) {
                sum = N1.plus(N2)
                listStr.add(sum)
            }

            if (i.contentEquals(i.toUpperCase()) && N1 != N2) {
                subtract = N1.minus(N2)
                listStr.add(subtract)
            }
        }
    }

    for (s in listStr) {
        println(s)
    }
}