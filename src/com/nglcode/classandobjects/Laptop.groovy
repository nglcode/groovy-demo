package com.nglcode.classandobjects

class Laptop {

    def price
    def brand
    def screenWorkingCondition

    static main(args) {
        Laptop laptop = new Laptop()
        laptop.logIn()
        laptop.logOut()

        laptop.price = 10000
        laptop.brand = "lenovo"
        laptop.screenWorkingCondition = true

        println("Price: " + laptop.price)
        println("Brand: " + laptop.brand)
        println("Screen: " + laptop.screenWorkingCondition)
    }

    def logIn() {
        println("System Logging IN")
    }

    def logOut() {
        println("System Logging OUT")
    }

}
