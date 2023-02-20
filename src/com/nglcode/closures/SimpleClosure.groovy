package com.nglcode.closures

class SimpleClosure {

    static void main(String[] args) {

        def wish = {
            println("Hello Groovy User!")
        }

        // two ways to execute closure
        // 1- Explicit call
        wish.call()

        // 2- Implicit call
        wish()

    }
}
