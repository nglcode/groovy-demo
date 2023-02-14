package com.nglcode.inheritance.multilevel

class ScientificCalculator extends AdvancedCalculator {

    static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator()
        sc.add()
        sc.subtract()
        sc.multiply()
        sc.divide()
        sc.calculus()
        sc.statistics()
    }

    def calculus(){
        println("Calculus functions")
    }

    def statistics(){
        println("Statistics functions")
    }

}
