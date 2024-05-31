package Test

import java.util.Scanner

fun nearestEvenFibonacci(N: Int, queries: IntArray):Int{

    //this is default OUTPUT. You can change it.
    var result:Int = -404


    //write your Login here:
    return result
}

fun main() {
    //Input [uncomment & modify only if required]
    val sc = Scanner(System.`in`)
    val N:Int = sc.nextInt()
    var queries = IntArray(N)
    for (i in 0..N-1){
        queries[i] = sc.nextInt()
    }

    //OUTPUT [uncomment & modify only if required]
    println(nearestEvenFibonacci(N,queries))
}