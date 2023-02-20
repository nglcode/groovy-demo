package com.nglcode.closures

class ClosureWithParameters {

    static void main(String[] args) {

        def wish = { def name ->
            println("Hello Groovy User named ${name}!")
        }

        wish("Marco")
        wish("Polo")

        def add = {
            def a,b -> println(a+b)
        }

        add(3,10)
        add(50,150)

    }
}
