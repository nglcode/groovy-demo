package com.nglcode.collections

class Sets {

    static void main(String[] args) {

        def languages = ["Groovy", "Java", "Python", "PHP", "Go", "Rust"] as Set
        println(languages)


        // print set
        languages.each {
            println(it)
        }

        // set size
        println("Size: ${languages.size()}")

        // retrieve values
        println("Second value: ${languages[2]}")

        // add value
        languages.add("TypeScript")
        println("Added TS: ${languages}")

        languages << "Ruby"
        println("Added Ruby: ${languages}")

        languages = languages.plus("Perl")
        println("Added Perl: ${languages}")

        languages = languages + ["C#"]
        println("Added C#: ${languages}")

        // remove value
        languages.remove("C#")
        println("Removed C#: ${languages}")

        languages.remove(8)
        println("Removed item index 8: ${languages}")

        languages = languages.minus("Ruby")
        println("Removed Ruby: ${languages}")

        languages = languages - ["TypeScript"]
        println("Removed TypeScript: ${languages}")

        // adding duplicate value
        languages << "Groovy"
        languages << "Java"
        println("After duplicates: ${languages}")

        // sorting set
        languages = languages.sort()
        println(languages)

        // compare sets
        def languages1 = ["Groovy", "Java", "Python"] as Set
        def languages2 = ["Groovy", "Java", "Python"] as Set
        def languages3 = ["Ruby", "Java", "Python"] as Set
        def languages4 = ["Java", "Python", "Groovy"] as Set

        if (languages1 == languages2) {
            println("Same sets")
        }

        if (languages1 == languages3) {
            println("Same sets")
        } else {
            println("Different sets")
        }

        if (languages1 == languages4) {
            println("Same sets")
        } else {
            println("Different sets")
        }

        // manipulation
        def newLanguages = languages.collect {
            it + " Language"
        }
        println(newLanguages)

        // find match
        println(languages.findAll {
            it.contains("a")
        })

        // iterator
        def iterator = newLanguages.iterator()
        while(iterator.hasNext()) {
            println(iterator.next())
        }




    }
}
