fun main() {
    val account = readLine()?.toInt()?: 0
    val percent = readLine()?.toInt()?: 0
    println(accountAfterThreeYears(account, percent))
}

fun accountAfterThreeYears(account: Int, percent: Int): Double {
    var i = 3
    var accountTotal:Double = account.toDouble()
    while(i > 0) {
        accountTotal += accountTotal * percent / 100
        i--
    }
    return accountTotal
}
