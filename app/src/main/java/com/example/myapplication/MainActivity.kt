fun main(args: Array<String>) {
    val originalString = "kayak" //Enter text here

    var reverseString = ""
    val length = originalString.length

    for (i in (length - 1) downTo 0) {
        reverseString += originalString[i]
    }


    if (originalString.equals(reverseString, ignoreCase = true)) {
        println("The given string is Palindrome")
    } else {
        println("The given string is NOT a Palindrome")
    }
}

