package oop

import com.sun.jdi.Bootstrap

//to create a class use the "class" keyword
//After the class keyword , add the name of the class with starting letter in uppercase
//class == blueprint
class Car{
//    properties: kt variables
    var color:String = "Red"
    var num_sits:Int = 4
    var onGear:Boolean = false
    var tires:String = "Black"
    var windows:Int = 4
    val year_of_production:Int = 2019

//    method: a function inside a class
    fun printDetails():Unit{
    println("Color: $color")
    println("Number of sits: $num_sits")
    println("On gear?: $onGear")
    println("Tire color: $tires")
    println("No Of Windows: $windows")
}
//    methods that take args
fun accelerate(speed:Int){
    println("This car has a speed of $speed kmh")
}
    fun production_year():Int{
        return year_of_production
    }




}

fun main(args: Array<String>) {
//    object/instance : is an example of a blueprint
//    to create an object, declare it a val or var
//    then give it a name , then assign it to the class==blueprint
    val car1 = Car()
    val car2 = Car()
//    car1: object/instances
//    Car(): class/blueprints
//    accessing properties in an object and methods,
//    use them "."operator
//    a method is a function that is inside a class
    println(car1.color)
    println(car1.num_sits)
    println(car1.onGear)
    println(car1.tires)
    println(car1.windows)

//calling a method
    car1.printDetails()

//    changing object properties
//    refer to object, use dot operator to access the property that needs change
    car2.color = "Green"
    car2.num_sits = 5
    car2.onGear = true
    car2.tires = "White"
    car2.windows =  5

    car1.printDetails()
    car2.printDetails()
    car1.accelerate(120)
    car1.accelerate(250)
    car1.production_year()
    car1.production_year()
//    1. store the returned value in a variable and print
    val yop:Int = car1.production_year()
    println(yop)
//    2.print results directly
    println(car1.production_year())





}