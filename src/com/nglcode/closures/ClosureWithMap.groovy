package com.nglcode.closures

class ClosureWithMap {

    static void main(String[] args) {

        def map = [fruit:"apple", language:"english", device:"mouse"]
        println(map)

        map.each {element -> println(element.key)}
        map.each {element -> println(element.value)}
        map.each {element -> println(element.value + " is a String.")}

    }
}
