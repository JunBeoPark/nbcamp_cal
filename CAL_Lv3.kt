
fun main() {
    val calc = Calculator()
    println("1 더하기 2 결과는 : ${calc.addOperation(AddOperation(), 1, 2)} 입니다")
}

class Calculator {
    fun addOperation(##답안##): Double {
        return ##답안##
    }
}

class AddOperation{
   fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}

class SubstractOperation{
   fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble()
}

class MultiplyOperation{
   fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
}

class DivideOperation{
   fun operate(num1: Int, num2: Int): Double = (num1 / num2).toDouble()
}