
fun main() {
    val calc = Calculator()
    var num1
    var num2
    
    println("${num1} 더하기 ${num2} 결과는 : ${calc.addOperation(AddOperation(), num1, num2)} 입니다")
    println("${num1} 뺴기 ${num2} 결과는 : ${calc.substractOperation(SubstractOperation(), num1, num2)} 입니다")
    println("${num1} 곱하기 ${num2} 결과는 : ${calc.multiplyOperation(MultiplyOperation(), num1, num2)} 입니다")
    println("${num1} 나누기 ${num2} 결과는 : ${calc.divideOperation(DivideOperation(), num1, num2)} 입니다")
}

class Calculator {
    fun addOperation(num1: Int, num2: Int): Double {
        var num3 = num1 + num2
        
        return num3
    }

    fun substractOperation(num1: Int, num2: Int): Double {
        var num3 = num1 - num2
        
        return num3
    }

        fun multiplyOperation(num1: Int, num2: Int): Double {
        var num3 = num1 * num2
        
        return num3
    }

    fun divideOperation(num1: Int, num2: Int): Double {
        var num3 = num1 / num2
        
        return num3
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
