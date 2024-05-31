package Test

import java.util .*

//10
//3 4 5

//result: 3

fun memoryPartiotioning(n: Int, x: Int, y: Int, z: Int): Int {
    //this is default OUTPUT. You can change it.
    // Sorting X, Y, Z to simplify the logic
    val sizes = intArrayOf(x, y, z).sortedArrayDescending()

    // Dynamic programming array to store the maximum parts for each memory size
    val dp = IntArray(n + 1) { 0 }

    // Base case: If the memory size is exactly equal to any of X, Y, Z, then 1 part is possible
    sizes.forEach { size ->
        if (size <= n) {
            dp[size] = 1
        }
    }

    // Filling the dp array using bottom-up dynamic programming
    for (i in 1..n) {
        sizes.forEach { size ->
            if (size <= i && dp[i - size] > 0) {
                dp[i] = maxOf(dp[i], 1 + dp[i - size])
            }
        }
    }

    // The maximum possible parts will be stored at dp[N]
    return dp[n]
}

fun main() {
    //INPUT [uncomment & modify if required]
    val n: Int
    val x: Int
    val y: Int
    val z: Int
    val sc = Scanner(System.`in`)
    n = sc.nextInt()
    x = sc.nextInt()
    y = sc.nextInt()
    z = sc.nextInt()

    //OUTPUT [uncomment & modify if required]
    println(memoryPartiotioning(n, x, y, z))
}