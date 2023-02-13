package com.nglcode.staticdemo

class StaticDemo {

    static num = 10

    static main(args) {

        EmployeeData ed1 = new EmployeeData()
        ed1.empId = 101
        ed1.empName = "Marco"

        println "Employee ID: " + ed1.empId
        println "Employee Name: " + ed1.empName
        println "Company: " + EmployeeData.companyName

        EmployeeData ed2 = new EmployeeData()
        ed2.empId = 102
        ed2.empName = "Polo"

        println "Employee ID: " + ed2.empId
        println "Employee Name: " + ed2.empName
        println "Company: " + EmployeeData.companyName

        StaticDemo.doubleTheNum()
    }

    static def doubleTheNum() {
        println(num * 2)
    }
}
