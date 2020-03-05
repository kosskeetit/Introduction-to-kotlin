package arrays

fun main(args: Array<String>) {

//Array is collection of similar data types either of
//int, string etc. Array in kotlin is mutable in
//nature with fixed size which means we can perform
//both read and write operations on elements of array.
//you can declare an array explicitly and implicitly
//use the array function to crate an array

//Declaring an array explicitly
    val country: String = "Kenya"//array declaration implicit dec
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val names = arrayOf("John", "Mary", "Paul", "Mike")

//Declaring an array implicitly
    val county: String = "Nai"//array declaration implicit dec
    val nums = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
    val majina = arrayOf<String>("John", "Mary", "Paul", "Mike","Mo")

//accessing array items
//1.use index numbers
    println(numbers[0])
//    2. use get(), takes the index number as an arguement
    println(majina.get(2))

//    creating an array using factory functions
    val cars = intArrayOf(1,3,5,6,7,8,9,5)
    val isTrue = booleanArrayOf(true,false)

//    changing array values: use set() method
//    set() method takes two argueements: one is the index of the
//    value you want to change, the other arg is the value to
//    replace with
    majina.set(1, "Konny")
    println(majina.get(1))

//    knowing the size of an array
    val num_names:Int = majina.size
    println(num_names)

//    looping through an array
    for (i in 0..num_names-1){
        println(majina.get(i))
        println(majina[i])
    }
//    length of characters in a string
    println(majina[1].length)


    for (i in 0..num_names-1){
        if (majina.get(i).length > 3){
            println (majina[i])
        }else{
            println(majina[i])
        }

    }
}