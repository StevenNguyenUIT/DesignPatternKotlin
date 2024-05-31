package Test

import java.util.Scanner

//xyaebd
//output 11

//11
//output 3

fun moreConsonants(s: String): Int {
    var count = 0
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    for (i in s.indices) {
        var consonants = 0
        var vowelsCount = 0

        for (j in i until s.length) {
            if (s[j] in vowels) {
                vowelsCount++
            } else {
                consonants++
            }
            if (consonants > vowelsCount) {
                count++
            }
        }
    }
    return count
}

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.next()
    sc.close()

    //output
    println(moreConsonants(str))
}