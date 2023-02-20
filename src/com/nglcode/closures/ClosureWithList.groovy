package com.nglcode.closures

class ClosureWithList {

    static void main(String[] args) {

        def list = [10,20,30,40,50]

        list.each { println(it)}

        list.each {println(it+5)}

        list.each {element -> println(element > 30)}

    }
}
