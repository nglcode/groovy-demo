package com.nglcode.classandobjects

class DataTypes {

    static main(args) {

        byte byteVar = 100
        println(byteVar.getClass().toString())
        println(byteVar)

        short shortVar = 1000
        println(shortVar.getClass().toString())
        println(shortVar)

        int intVar = 10000
        println(intVar.getClass().toString())
        println(intVar)

        long longVar = 10000000L
        println(longVar.getClass().toString())
        println(longVar)

        float floatVar = 10.1f
        println(floatVar.getClass().toString())
        println(floatVar)

        double doubleVar = 10.10
        println(doubleVar.getClass().toString())
        println(doubleVar)

        boolean booleanVar = true
        println(booleanVar.getClass().toString())
        println(booleanVar)

        char charVar = 'x'
        println(char.getClass().toString())
        println(charVar)
    }
}
