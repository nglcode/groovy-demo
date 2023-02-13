package com.nglcode.classandobjects

class Methods {


    static main(args) {
        Methods methods = new Methods()
        methods.simpleMethod()
        methods.paramsMethod(10, 20, 30)
        def total = methods.returnMethod(1,2,3)
        println("Sum total: " + total)
        def totalOptional = methods.optionalParamsMethod(10,20)
        println("Sum total optional: " + totalOptional)
    }

    def simpleMethod() {
        int a = 10
        int b = 20
        int c = a+b
        println("Sum: " + c)
    }

    def paramsMethod(def firstValue, def secondValue, def thirdValue) {
        def total = firstValue + secondValue + thirdValue
        println("Total: " + total)
    }

    def returnMethod(firstValue, secondValue, thirdValue) {
        // It is possible to return values without return keyword
        firstValue + secondValue + thirdValue
    }

    def optionalParamsMethod(firstValue, secondValue, thirdValue=30) {
        firstValue + secondValue + thirdValue
    }
}
