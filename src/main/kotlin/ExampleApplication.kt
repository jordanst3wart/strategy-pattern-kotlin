package org.example

interface Strategy {
    fun execute(a: Int, b: Int): Int
}

class ConcreteStrategyAdd : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a + b
    }
}

class ConcreteStrategySubtract : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a - b
    }
}

class ConcreteStrategyMultiply : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a * b
    }
}

class Context {
    private lateinit var strategy: Strategy

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun executeStrategy(a: Int, b: Int): Int {
        return strategy.execute(a, b)
    }
}

fun main() {
    val context = Context()
    // actually get an input
    println("Enter first number:")
    val firstNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter second number:")
    val secondNumber = readlnOrNull()?.toIntOrNull() ?: 0

    // if statements...
    println("Enter operation (addition/subtraction/multiplication):")
    when (readlnOrNull()?.lowercase()) {
        "addition" -> context.setStrategy(ConcreteStrategyAdd())
        "subtraction" -> context.setStrategy(ConcreteStrategySubtract())
        "multiplication" -> context.setStrategy(ConcreteStrategyMultiply())
        else -> {
            println("Invalid operation")
            return
        }
    }

    val result = context.executeStrategy(firstNumber, secondNumber)
    println("Result: $result")
}