package com.nglcode.datatypes

class GroovyDataTypes {

    static main(args) {

        def byteVar = 100
        println(byteVar.getClass().toString())
        println(byteVar)

        def shortVar = 1000
        println(shortVar.getClass().toString())
        println(shortVar)

        def intVar = 10000
        println(intVar.getClass().toString())
        println(intVar)

        def longVar = 10000000L
        println(longVar.getClass().toString())
        println(longVar)

        def floatVar = 10.1f
        println(floatVar.getClass().toString())
        println(floatVar)

        def doubleVar = 10.10
        println(doubleVar.getClass().toString())
        println(doubleVar)

        def booleanVar = true
        println(booleanVar.getClass().toString())
        println(booleanVar)

        def charVar = 'x'
        println(char.getClass().toString())
        println(charVar)
    }
}
