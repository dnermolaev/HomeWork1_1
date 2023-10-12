fun main () {
    val transferAmount = 100
    val feeRate = 0.0075
    val feeRateMin = 35

    var feeTotal = transferAmount* feeRate
    var result = if (feeTotal>35) feeTotal else feeRateMin

    println(result)
}
