package com.nglcode.overriding

class ChildClass extends ParentClass {

    static void main(String[] args) {

        ChildClass cc = new ChildClass()
        cc.sum()
        cc.subtract()

    }

    def sum() {
        println("Child sum")
    }





}
