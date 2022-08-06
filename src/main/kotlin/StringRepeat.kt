fun main() {
    println(stringRepeat(readln().toInt() , readln()))
}

fun stringRepeat(r: Int, str: String): String {
    return str.repeat(r)
}