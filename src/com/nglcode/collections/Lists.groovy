package com.nglcode.collections

class Lists {

    static void main(String[] args) {

        // declaration
        def languages = ["Groovy", "Java", "Python", "PHP", "Go", "Rust"] as List

        // size
        def languageSize = languages.size()

        println(languages)
        println("List size: $languageSize")
        println("List size: ${languages.size()}")

        // retrieve value
        println("First index: ${languages[1]}")

        // add value
        languages.add("TypeScript")
        println("Added TS: ${languages}")

        languages << "Ruby"
        println("Added Ruby: ${languages}")

        languages = languages.plus("Perl")
        println("Added Perl: ${languages}")

        languages = languages + ["C#"]
        println("Added C#: ${languages}")

        languages.push("JavaScript")
        println("Added JavaScript: ${languages}")

        // remove value
        languages.remove("C#")
        println("Removed C#: ${languages}")

        languages.remove(8)
        println("Removed item index 8: ${languages}")

        languages = languages.minus("Ruby")
        println("Removed Ruby: ${languages}")

        languages = languages - ["TypeScript"]
        println("Removed TypeScript: ${languages}")

        languages.pop()
        println("Removed last element: ${languages}")


        // adding duplicate value
        languages << "Groovy"
        languages << "Java"
        println("With duplicates: ${languages}")

        // counting items
        println("Groovy occurrences: ${languages.count("Groovy")}")
        println("""Java occurrences: ${languages.count {
            it == "Java"
        }}""")

        // comparison

        def languages1 = ["Groovy", "Java", "Python"]
        def languages2 = ["Groovy", "Java", "Python"]

        if (languages1 == languages2) {
            println("Both lists are equal")
        }

        def languages3 = ["Groovy", "Java", "Python", "PHP"]

        if (languages1 == languages3) {
            println("Both lists are equal")
        } else {
            println("Different lists")
        }

        // manipulate list
        def newLanguages = languages.collect {
            it + " Language"
        }
        println(newLanguages)

        // find match
        println(languages.findAll {
            it.contains("y")
        })

        // print all elements
        languages.each {
            println(it)
        }
    }

}
