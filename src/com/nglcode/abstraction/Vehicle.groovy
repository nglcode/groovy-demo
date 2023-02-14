package com.nglcode.abstraction

abstract class Vehicle {

    def seats(){
        println "The seats"
    }

    def wheels(){
        println "The wheels"
    }

    abstract def gears()
    abstract def armored()
}
