fun main(args: Array<String>) {
    val s1 = readln()
    println(changeAlphabet(s1))
}

fun changeAlphabet(str: String): String {
    var res = ""
    for (char in str) {
        res += if(char.isUpperCase()) char.lowercaseChar()
        else char.uppercaseChar()
    }

    return res
}