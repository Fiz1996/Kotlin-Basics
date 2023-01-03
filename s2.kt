package com.example.tuwaiqfirstprojectforandroid

fun main() {

    for (i in 0 .. 100 ) {
        if(i >70) {
            println("it is over 70")
            break
        }


    }
    var temp= 35

    while (temp !=10) {
        temp --
        when(temp) {
            30 -> println("It's HOT")
            20 -> println("IT'S COMFY")
            15 -> println("IT'S COLD")
        }
    }
}
