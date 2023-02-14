package com.nglcode.inheritance

class AdvancedCalculator extends Calculator {

    def multiply() {
        println("Multiplying the number")
    }

    def divide() {
        println("Dividing the number")
    }

    static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator()
        ac.add()
        ac.subtract()
        ac.multiply()
        ac.divide()

        println(ac.brand)
        println(ac.solarPowered)
    }
}
