package com.example.tuwaiqfirstprojectforandroid

fun main() {

    op(1.0, 1.0,"*" )


    }

fun op (d1:Double , d2:Double , s1:String ="+")  {

    when(s1) {
        "+" -> println(d1.plus(d2))
        "-" -> println(d1-d2)
        "/" -> println(d1/d2)
        "*" -> println(d1*d2)
        else -> println("you have sent a wrong argument in operation")
    }

}