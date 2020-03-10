package oop
class calculator(num1:Int,num2:Int){
    var no1:Int
    var no2:Int
    init {
        this.no1 = num1
        this.no2 = num2
    }
    fun addition(num1:Int,num2: Int){
        println(num1+num2)
    }
    fun subtraction(num1:Int,num2: Int){
        println(num1-num2)
    }
    fun multiplication(num1:Int,num2: Int){
        println(num1*num2)
    }
    fun division(num1:Int,num2: Int){
        println(num1/num2)
    }

}

fun main(args: Array<String>) {
    val calc = calculator(0,0)
    calc.addition(23,46)
    calc.subtraction(23,46)
    calc.multiplication(23,46)
    calc.division(46,23)
}
