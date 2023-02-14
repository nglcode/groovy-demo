package com.nglcode.controlstatements

class BreakContinue {

    static main(args) {

        for (def i in 1..10) {
            println(i)
            if (i == 7) {
                break
            }
        }

        for (def i in 1..10) {
            if (i == 7)
                continue
            println(i)
        }






    }
}
