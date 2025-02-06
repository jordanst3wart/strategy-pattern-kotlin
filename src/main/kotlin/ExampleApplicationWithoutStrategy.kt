package org.example

fun main() {
    println("Enter first number:")
    val firstNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter second number:")
    val secondNumber = readlnOrNull()?.toIntOrNull() ?: 0

    // if statements...
    println("Enter operation (addition/subtraction/multiplication):")
    val result = when (readlnOrNull()?.lowercase()) {
        "addition" -> firstNumber + secondNumber
        "subtraction" -> firstNumber - secondNumber
        "multiplication" -> firstNumber * secondNumber
        else -> {
            throw Exception("Invalid operation")
        }
    }
    println("Result: $result")
}