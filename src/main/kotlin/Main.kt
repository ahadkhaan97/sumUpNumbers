fun main() {
    print(solution("there are some (12) digits 5566 in this 770 string 239"))
}

fun solution(inputString: String): Int {
    var sum = 0
    var tempNumber = ""
    inputString.forEach {
        if (it.isDigit()) {
            tempNumber += it
        } else {
            if (tempNumber.isNotEmpty())
                sum += tempNumber.toInt()
            tempNumber = ""
        }
    }
    if (tempNumber.isNotEmpty())
        return sum + tempNumber.toInt()
    return sum
}