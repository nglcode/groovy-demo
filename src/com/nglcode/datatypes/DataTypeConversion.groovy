package com.nglcode.datatypes

class DataTypeConversion {

    static main(args) {

        def charValueDef = 65
        println(charValueDef)

        char charValueChar = 65
        println(charValueChar)

        def charValueConversion = 65 as char
        println(charValueConversion)

        def strNumber = "100"
        println(strNumber.getClass().toString())
        println(strNumber)

        def strNumberConversion = "100" as int
        println(strNumberConversion.getClass().toString())
        println(strNumberConversion)
    }


}
