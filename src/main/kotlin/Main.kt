import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction


enum class Color {
    RED, GREEN, BLUE
}


fun main(args: Array<String>) {
    println("Hello World!")





    fun sum(): Int {
        val x = 1222 // get from map
        println("X = $x")

        val y = 33333
        println("X = $y")

        val result = when {
            x == 1 -> 1111
            y == 3 -> 2222
            else -> 44444
        }

        println("Result after when is $result")

        return result
    }



    println(sum())



}