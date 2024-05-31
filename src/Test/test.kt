package Test

fun main() {
    outer@
    for(num1 in 4 downTo 1){
        inner@
        for(num2 in 4 downTo 1){
            if(num1 <=3){
                continue@outer
            }
            println("num1 = $num1; num2 = $num2")
        }
    }
}