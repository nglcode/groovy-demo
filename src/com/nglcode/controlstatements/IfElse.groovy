package com.nglcode.controlstatements

class IfElse {

    static main(args) {


        if (1 > 0) {
            println("Inside if block")
            if ("groovy".contains('y')) {
                println("Inside nested if block")
            }
        }

        if (1 < 0) {
            println("Inside if block")
        } else {
            println("Inside if block, else condition")
        }

        if (1 < 0) {
            println("Inside if block")
        } else if (1 == 1) {
            println("Inside if block, else if condition")
        } else {
            println("Inside if block, else condition")
        }


        println("Outside if block")


    }
}
