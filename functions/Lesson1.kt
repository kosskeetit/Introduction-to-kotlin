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
fun volume (radius:Int, height:Int) {
    val p: Float = 3.142f
    val volume = p * height * radius * radius
    println("The volume is $volume")
}
//A function that returns a value
//a function that returns a value has to specify the return
//type (Int, string,Double, Boolean)
//A function can return a useful value or non useful value
//Useful values are like Int, String, Double etc
//Non useful values can be a bare string ie "Hello World"
fun get_age():Int{
//    to return a value use the "return" statement
    return 23
}

fun sum_of_two (num1:Int, num2:Int):Int{
//    Int:return type
    val sum:Int = num1+num2
    return sum
}
fun get_name(username:String):String{
    return username
}
//returning non useful data: use unit type
fun sayHello():Unit{
    println("Hello World")
}
fun sayHello2(username: String):Unit{
    println("Hello My name is $username")
}
fun sayHello3(username:String, age:Int):Unit{
    val sentence = "my name is $username and I am $age years old"
    println(sentence)
}
//default arguments in a function province is a default arguement
fun getDetails(username:String,age:Int,province:String= "Wuhan"){
    println("Name :$username")
    println("Age :$age")
    println("Province :$province")//default args
}

//comments
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
//    get_age() returns int 23 to variable my_age
    val my_age:Int = get_age()
    println(my_age)

    val results:Int = sum_of_two(43,35)
    println(results)

    val jina:String = get_name("Kosskeetit")
    println(jina)
    sayHello()
    sayHello2("Johnte")
    sayHello3("Brayo", 5)
    getDetails("Kevo",30)
    getDetails("Kevo",30,"Shangai")
    getDetails(province = "Shangai",username = "Johnte Doe",age = 23)


}