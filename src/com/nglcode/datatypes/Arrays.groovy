package com.nglcode.datatypes

class Arrays {

    static main(args) {

        def languages = new String[3]

        languages[0] = "Groovy"
        languages[1] = "Java"
        languages.putAt(2, "Python") // alternative way to add value.

        println languages
        println("Size method: " + languages.size())
        println("Length property: " + languages.length)

        def arrayAfterRemovePython = languages - "Python"
        println arrayAfterRemovePython

    }
}
