package org.example

fun main() {
    println("Enter first number:")
    val firstNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter second number:")
    val secondNumber = readlnOrNull()?.toIntOrNull() ?: 0

    // don't need multiplication, and can just enter a negative number for subtraction
    val result = firstNumber + secondNumber
    println("Result: $result")
}