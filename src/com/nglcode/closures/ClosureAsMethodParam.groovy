package com.nglcode.closures

class ClosureAsMethodParam {

    static void main(String[] args) {

        def wish = {
            println("Closure as method parameter!")
        }

        sampleMethod(wish)

    }

    static def sampleMethod(clos) {
        clos() // clos.call()

    }


}
