package com.nglcode.closures

class ClosureCollect {

    static void main(String[] args) {

        def list = [10,20,30,40,50]

        println( list.collect {elem -> elem * 5} )

        list = ["java", "groovy", "python"]

        println( list.collect {elem -> elem.contains('o')} )

    }
}
