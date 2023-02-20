package com.nglcode.closures

class ClosureFind {

    static void main(String[] args) {

        def list = [1,2,3,4,5,6]

        def value = list.find { it -> it > 3 }
        println(value)

        println( list.find{elem -> elem == 3} )

        println( list.find{elem -> elem == 7} )

        println( list.findAll {item -> item > 3})

        list = ["java", "groovy", "python"]
        println( list.findAll {elem -> elem.contains('o')} )
    }
}
