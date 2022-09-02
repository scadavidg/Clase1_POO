package com.example.clase1

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class AccountTest {

    @Test
    fun `verify account creation should be an instance of Account`(){
        val accountStuart = Account(
            1,
            "stuart",
            "savings",
            "01/01/2020",
            2000.0
        )
        assertThat(accountStuart).isInstanceOf(Account::class.java)
        assertThat(accountStuart.accountNumber).isEqualTo(1)
        assertThat(accountStuart.username).isEqualTo("stuart")
        assertThat(accountStuart.accountType).isEqualTo("savings")
        assertThat(accountStuart.openDate).isEqualTo("01/01/2020")
        assertThat(accountStuart.amount).isEqualTo(2000.0)
    }

    @Test
    fun `verify createAccount function`(){
        val accountSantiago = createAccount(
            2,
            "santiago",
            "savings",
            "01/01/2017",
            200000.0
        )
        assertThat(accountSantiago).isInstanceOf(Account::class.java)
        assertThat(accountSantiago.accountNumber).isEqualTo(2)
        assertThat(accountSantiago.username).isEqualTo("santiago")
        assertThat(accountSantiago.accountType).isEqualTo("savings")
        assertThat(accountSantiago.openDate).isEqualTo("01/01/2017")
        assertThat(accountSantiago.amount).isEqualTo(200000.0)
    }

    @Test
    fun `verify takeMoneyOut and putMoneyIn functions`(){
        val accountSantiago = createAccount(
            2,
            "santiago",
            "savings",
            "01/01/2017",
            10.0
        )

        accountSantiago.takeMoneyOut(2.0)
        assertThat(accountSantiago.amount).isEqualTo(8.0)

        accountSantiago.putMoneyIn(6.0)
        assertThat(accountSantiago.amount).isEqualTo(14.0)
    }
}