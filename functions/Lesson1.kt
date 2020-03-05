package functions


//a block of code that has a specific task e.g println()
//fun nameOfFunction(){
//    code to execute
//}
fun greetings1(){
    println("Hello World")
}
//    a function that can take in an argument
//parameter: a variable passed into a function during function
fun greetings2(name:String){
    println("Hello $name")
}
fun greetings3(name:String,age:Int){
    println("Hi I am $name, am $age years old")
}
fun countchar (name: String){
    val x = name.length
    println(x)
}
fun sum(num1:Int,num2:Int){
    println(num1 + num2)
}
fun area_of_circle(radius:Int){
    println(3.142*radius*radius)
}
fun takrimu(no:String){
    var int_no:Int = no.toInt()
    if (int_no % 2 == 0){
        println("Your no is even")
    }else{
        println("Your no is odd")
    }
}
fun volume (radius:Int, height:Int){
    val p :Float = 3.142f
    val volume = p *height * radius * radius
    println("The volume is $volume")
}

fun main(args: Array<String>) {
//    to call a function use greetings1()
//    must be in the main function
    greetings1()
    println("Hello once again")
    greetings2("John")// John is an argument
    greetings3("Johnte",23)
    countchar("LeRoy Koske")
    sum(23,43)
    area_of_circle(7)
    takrimu("34")
    volume(23,23)



}