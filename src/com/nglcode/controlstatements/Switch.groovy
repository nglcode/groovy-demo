package com.nglcode.controlstatements

class Switch {

    static main(args) {
        def points = 25

        switch (points) {
            case 0..10:
                println("Level 1")
                break
            case 10..20:
                println("Level 2")
                break
            case 20..30:
                println("Level 3")
                break
            default:
                println("Level X")
                break
        }


    }
}
