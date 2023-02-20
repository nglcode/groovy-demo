package com.nglcode.closures

class ClosureAnyAndEvery {

    static void main(String[] args) {

        def list = [10,20,30,40,50]

        println( list.any {it -> it > 30} )
        println( list.any {it -> it > 60} )

        println( list.every {it -> it > 30} )
        println( list.every {it -> it > 3} )

    }
}
