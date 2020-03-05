package Lesson1.lesson1
//kotlin code gets executed/run only in the main function
//main() function defines where kotlin code gets executed
//the {} defines the scope of your executable code

fun main() {
//    println(): print content with a new lin at the end
//    print():prints content with a continous line
    println("Hello World")
    println("Hello World")
    println("Hello World")
    print("HELLO WORLD ")
    print("HELLO WORLD ")
    print("HELLO WORLD ")
    println()
//    explicitly defining the type of variable
        val country:String ="Kenya" //CONSTANT
        var county:String = "Kericho"
        var age:Int = 23
        var gender:String
        gender = "Male"


        county = "UG"
        println(country)
        println(county)
        println(age)

//    implicitly defining the type of variables
        val name = "John Doe"
        var language = "kotlin"

        println(name)
        println(language)


//    kotlin data types
//    1.numbers
//            1.1. integers: Non decimal number
                    var my_age:Int =23
                    println(my_age)
                    my_age += 10
                    println(my_age)
//            1.2 floats: decimal numbers
                    val height = 3.56F
                    println(height)

//    2.booleans:state true or false
            val isloggedin: Boolean = true
            val isloggedout: Boolean = false
                println(isloggedin)
                println(isloggedout)
//    3.strings
            var length:Int = 25
            var ruler:String = "Oxford"
            println("The length of the "+ruler+" ruler is "+length+" cm")
            println("The length of the $ruler ruler is $length cm")
//    4.characters: declared using single quotes
            val first_letter = "J"
            println(first_letter)

//    Assignment: create two variables num_1 and num_ storing 10 and 20 respectively, and
//    calculate the sum of the two numbers
            val num_1:Int = 10
            val num_2:Int = 20
            println(num_1+num_2)
//    5.arrays



}
