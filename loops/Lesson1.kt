package loops

//forloop
//syntax
fun main(args: Array<String>) {
//    incrementing by 2
    for(i in 0..20 step 2){
        if (i == 4){
         println("$i is equal to 4")
        }else{
            println("$i is not equal to 4")
//            println(i)
        }
    }

//    printing in reverse order
    for (i in 20 downTo 1){
        println(i)
    }
//while loop
    var a = 0
    while (a < 10){
        println(a)
        a++
    }
    var b = 1
    do {
        println(b)
        b++
    }while(b < 10)
//    assignment : FIZZBUZZ
    var x = 1
    for (x in 1..100){
        if(x % 15 == 0){
            println("$x - FIZZBUZZ")
        }else if (x % 5 == 0){
            println("$x - BUZZ")
        }else if(x% 3 == 0){
            println("$x - FIZZ")
        }
    }
//    Arrays
//functions

}