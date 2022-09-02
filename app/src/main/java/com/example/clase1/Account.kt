package com.example.clase1

data class Account(
    val accountNumber: Int,
    val username: String,
    var accountType: String,
    val openDate: String,
    var amount: Double
){
    fun takeMoneyOut(amountToDiscount: Double){
        amount -= amountToDiscount
    }

    fun putMoneyIn(amountToDiscount: Double){
        amount += amountToDiscount
    }
}

fun createAccount(
    accountNumber: Int,
    username: String,
    accountType: String,
    openDate: String,
    amount: Double
): Account {
    return Account(
        accountNumber,
        username,
        accountType,
        openDate,
        amount
    )
}
