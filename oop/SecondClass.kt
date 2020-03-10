package oop

//classes that are passed in data just ; like functions
//() constructors
class BenzS200(owner:String,number_plate:Int,val color:String= "Black") {
    var mwenye_gari :String// empty to store incoming data
    var plati :Int//empty to store incoming data
    var origin :String = "Germany"
//    mwenye_gari: class property
//    plati: class property
    init {
    this.mwenye_gari = owner
    this.plati = number_plate
    }

    fun printDetails(): Unit {
        println("The owner is $mwenye_gari and the number plate is $plati")
        println("Color is $color")
    }
}

fun main(args: Array<String>) {
    val b1 = BenzS200("Johnte",1234)
    b1.printDetails()
    println(b1.origin)
}