package com.nglcode.interfaces

class Car implements Vehicle {

    static void main(String[] args) {

        Car c1 = new Car()
        c1.seats()
        c1.wheels()
        c1.gears()
        c1.armored()

    }

    @Override
    def seats() {
        println "Car seats"
    }

    @Override
    def wheels() {
        println "Car wheels"
    }

    @Override
    def gears() {
        println "Car gears"
    }

    @Override
    def armored() {
        println "Car armor"
    }
}
