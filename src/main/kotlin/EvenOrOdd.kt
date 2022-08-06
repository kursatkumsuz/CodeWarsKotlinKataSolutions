
fun main() {
   println(evenOrOdd(readln().toInt()))
}
fun evenOrOdd(number: Int): String {
    if(number % 2 == 0 ) {
        return "Even"
    } else {
        return "Odd"
    }
}