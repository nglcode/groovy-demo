package com.nglcode.abstraction

class Car extends Vehicle {

    static void main(String[] args) {
        Car c1 = new Car()
        c1.seats()
        c1.wheels()
        c1.gears()
        c1.armored()
        c1.powerWindows()
    }

    @Override
    def gears() {
        println "Gears?"
    }

    @Override
    def armored() {
        println "Armored?"
    }

    def powerWindows(){
        println "The power windows"
    }
}
