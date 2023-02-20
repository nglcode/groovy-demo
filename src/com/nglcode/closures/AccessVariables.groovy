package com.nglcode.closures

class AccessVariables {

    static void main(String[] args) {

        def userName = "Cell"

        def wish = {
            println("Hello $userName!")
        }

        userName = "Stark"

        wish()


    }
}
