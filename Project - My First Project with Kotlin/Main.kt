fun main() {
    val earningByItem = mapOf(
        "Bubblegum" to 202,
        "Toffee" to 118,
        "Ice cream" to 2250,
        "Milk chocolate" to 1680,
        "Doughnut" to 1075,
        "Pancake" to 80,
    )

    println("Earned amount:")
    earningByItem.forEach { item, amount ->
        println("$item: $$amount")
    }

    val totalIncome = earningByItem.values.sum()
    println("\nIncome: $${totalIncome}")

    println("Staff expenses:")
    val staffExpenses = readln().toInt()

    println("Other expenses:")
    val otherExpenses = readln().toInt()

    println("Net income: $${totalIncome - (otherExpenses + staffExpenses)}")
}
