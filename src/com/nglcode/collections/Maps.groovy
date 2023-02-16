package com.nglcode.collections

class Maps {

    static void main(String[] args) {

        def emptyMap = [:]
        println("Map values: $emptyMap")

        def sampleMap = [language:"Groovy", category:"Programming"]
        println("sampleMap: $sampleMap")

        // adding values
        sampleMap.put("popularity", "Super")
        println("sampleMap: $sampleMap")

        sampleMap << [license:"Apache"]
        println("sampleMap: $sampleMap")

        // get values
        println(sampleMap.get("popularity"))
        println(sampleMap["language"])
        println(sampleMap.category)
        println(sampleMap."license")

        // replace values
        sampleMap['language'] = "Java"
        println("sampleMap: $sampleMap")

        sampleMap.language = "Groovy"
        println("sampleMap: $sampleMap")

        sampleMap.put("language", "Java")
        println("sampleMap: $sampleMap")

        sampleMap << [language: "Groovy"]
        println("sampleMap: $sampleMap")

        // size
        println("Size: ${sampleMap.size()}")

        // all keys
        def allKeys = sampleMap.keySet()
        println("Keys: ${allKeys}")

        // all values
        def allValues = sampleMap.values()
        println("Values: ${allValues}")

        // duplicates (cannot add duplicate values)
        sampleMap << [category:"Programming"]
        println("sampleMap (duplicate not added): $sampleMap")

        // print map using loop
        for (def item : sampleMap.keySet()) {
            println("Item: ${item}")
        }

        sampleMap.each {
            println("Key: ${it.key} - Value: ${it.value}")
        }

        for (item in sampleMap) {
            println("Item: ${item.key} - ${item.value}")
        }


        // remove values
        sampleMap.remove("license")
        println("sampleMap: $sampleMap")

        sampleMap = sampleMap - [popularity: "Super"]
        println("sampleMap: $sampleMap")

        sampleMap -= [category: "Programming"]
        println("sampleMap: $sampleMap")

    }
}
