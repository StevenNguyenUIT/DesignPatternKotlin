package Test

import java.util.*

//testCase 1
//4
//10 30 20 30
//Result: 5

//testCase 2
//5
//4 9 2 4 3
//Result: 1

//testCase 3
//20
//782 442 628 596 631 468 486 443 414 430 530 624 416 456 781 449 417 448 517 6
//Result: 25

fun findPower(N: Int, A: IntArray): Int {

    //this is default OUTPUT. You can change it.
    var result: Int = -404
    //write your Logic here:
    val pq = PriorityQueue<Int>(reverseOrder())

    for (value in A){
        pq.offer(value)
    }

    while (pq.size > 1){
        val a = pq.poll()
        val b = pq.poll()

        val newValue = if (a==b) a else {(a+b)/4}

        pq.offer(newValue)
    }
    result = pq.poll()
    return result
}

fun main() {
    //INPUT [uncomment & modify only if required]
    val sc = Scanner(System.`in`)
    var N: Int = sc.nextInt()
    var A = IntArray(N)
    for (i in 0..N - 1) {
        A[i] = sc.nextInt()
    }

    //OUTPUT [uncomment & modify only if required]
    println(findPower(N, A))

}

