package com.nglcode.classandobjects

class Variables {

    def instanceInt = 15
    def staticInt = 25

    static main(args) {
        Variables variables = new Variables()
        variables.myMethod()

        def a = 10
        def b = 20

        def(x,y,z) = [10,20,30]
        println("x :" + x)
        println("y :" + y)
        println("z :" + z)

    }

    def myMethod() {
        def localInt = 10
        println("Local var: " + localInt)
        println("Instance var: " + instanceInt)
    }
}
