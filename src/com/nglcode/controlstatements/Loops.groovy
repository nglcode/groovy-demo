package com.nglcode.controlstatements

class Loops {

    static main(args) {

        def randomNumber = 0
        while(randomNumber != 10) {
            randomNumber = (int) (Math.random() * 11)
            println("Number: " + randomNumber)
        }

        for (def i = 0; i <= 10; i++) {
            println("For loop #" + i)
        }

        println("==============")

        def words = ["Alpha", "Beta", "Gamma", "Delta", "Epsilon"]
        for (def word : words) {
            println(word)
        }

        println("==============")

        words.each {
            println("Each loop: " + it)
        }

        println("==============")

        0.upto(7, {
            println(it*2)
        })

        println("==============")

        10.times {
            println("Time #" + (it+1))
        }

        println("==============")

        for (i in 1..10) {
            println("InLoop #" + i)
        }

        println("==============")

        (1..10).each {
            println("Each loop with range #" + it)
        }

        println("==============")

        0.step(10,2) {
            println("Number every 2 steps: " + it)
        }

        println("==============")




    }
}
