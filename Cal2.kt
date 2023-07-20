# nbcamp_cal

fun main() {

}

class Calculator
var num1 = readLine()!!.toInt()
var num2 = readLine()!!.toInt()

var addOption = num1 + num2
var substractOption = num1 - num2
var multiplyOption = num * num2
var divideOption = num1 / num2
var modOption = num1 % num2

var result

if(result == addOption) { // +
	println("${num1} + ${num2} = ${addOption}")
}  else if(result == substractOption) { // -
  println("${num1} - ${num2} = ${substractOption}")
}  else if(result == multiplyOption) { // *
	println("${num1} * ${num2} = ${multiplyOption}")
}  else if(result == divideOption) { // /
	println("${num1} / ${num2} = ${divideOption}")
   else if(result == modOption) { // %
	println("${num1} / ${num2} 나머지 = ${modOption}")
else {
	println("Error")
}
