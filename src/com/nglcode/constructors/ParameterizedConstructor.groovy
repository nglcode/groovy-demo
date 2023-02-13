package com.nglcode.constructors

class ParameterizedConstructor {

    def empName
    def empId

    ParameterizedConstructor(empName, empId) {
        this.empName = empName
        this.empId = empId
        println "ParameterizedConstructor object created with " + empName + " and " + empId
    }

    static main(args) {

        ParameterizedConstructor dc1 = new ParameterizedConstructor("Marco", 101)
        ParameterizedConstructor dc2 = new ParameterizedConstructor("Polo", 102)
        
    }
}
