package com.nglcode.closures

class ClosureWithReturnType {

    static void main(String[] args) {

        def wish = { def name ->
            return "Hello Groovy User named ${name}!"
        }

        String value = wish("Marco")

        println(value)



    }
}
