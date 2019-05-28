package com.hurricane.kata.fizzbuzz

const val FIZZBUZZ = "fizzbuzz"
const val BUZZ = "buzz"
const val FIZZ = "fizz"

class FizzBuzz {
    fun translate(number: Int): String {
        return when {
            dividableByFifteen(number) -> FIZZBUZZ
            dividableByFive(number) -> BUZZ
            dividableByThree(number) -> FIZZ
            else -> numberWithNoChange(number)
        }
    }

    private fun dividableByFifteen(number: Int) =
            dividableByThree(number) && dividableByFive(number)

    private fun dividableByFive(number: Int) =
            number % 5 == 0

    private fun dividableByThree(number: Int) =
            number % 3 == 0

    private fun numberWithNoChange(number: Int) =
            number.toString()
}