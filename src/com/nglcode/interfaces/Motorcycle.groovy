package com.nglcode.interfaces

class Motorcycle implements Vehicle {

    static void main(String[] args) {

        Motorcycle m1 = new Motorcycle()
        m1.seats()
        m1.wheels()
        m1.gears()
        m1.armored()

    }

    @Override
    def seats() {
        println "Motorcycle seats"
    }

    @Override
    def wheels() {
        println "Motorcycle wheels"
    }

    @Override
    def gears() {
        println "Motorcycle gears"
    }

    @Override
    def armored() {
        println "Motorcycle armor"
    }
}
