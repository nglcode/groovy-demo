package com.nglcode.overloading

class MethodOverloading {

    static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading()
        mo.add(2)
        mo.add(2,3)
        mo.add(2,3,4)
        mo.add(2,1.5)

    }


    def add(a) {
        println(a + a)
    }

    def add(a,b) {
        println(a + b)
    }

    def add(Integer a, Float b) {
        println(a + b)
    }

    def add(a,b,c) {
        println(a + b + c)
    }



}
