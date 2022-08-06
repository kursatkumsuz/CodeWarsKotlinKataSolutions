
fun main() {
    println(noSpace(readln()))
}

fun noSpace(x: String): String = x.replace("\\s" .toRegex() , "")