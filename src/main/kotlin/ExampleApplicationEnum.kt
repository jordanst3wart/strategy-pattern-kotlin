package org.example

enum class Operations(val text: String) : Strategy {
    ADDITION("addition") {
        override fun execute(a: Int, b: Int): Int {
            return a + b
        }
    },
    SUBTRACTION("subtraction") {
        override fun execute(a: Int, b: Int): Int {
            return a - b
        }
    },
    MULTIPLICATION("multiplication") {
        override fun execute(a: Int, b: Int): Int {
            return a * b
        }
    };

    companion object {
        fun fromString(value: String?): Strategy {
            value ?: throw IllegalArgumentException("Input is null")
            val operation = entries.find { it.text.equals(value, ignoreCase = true) }
            operation ?: throw IllegalArgumentException("Invalid operation")
            return operation
        }
    }
}

fun main() {
    println("Enter first number:")
    val firstNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter second number:")
    val secondNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter operation (addition/subtraction/multiplication):")
    val strategy = Operations.fromString(readlnOrNull()?.lowercase())
    val result = strategy.execute(firstNumber, secondNumber)
    println("Result: $result")
}