package calculator

import camp.nextstep.edu.missionutils.Console

fun main() {
    val userInputString = userInputString()
    val splitList = splitString(userInputString)
    val sum = sumSplitList(splitList)
    println(sum)
}

fun userInputString():String {
    val input = Console.readLine()
    return input
}

fun splitString(userInputString:String):List<Int> {
    val basicSplitList = userInputString.split(",",":").map{it.toInt()}
    return basicSplitList

}

fun sumSplitList(splitList:List<Int>):Int {
    val sum = splitList.sum()
    return sum
}
