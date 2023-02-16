package com.nglcode.json

import groovy.json.JsonSlurper

class JsonSlurperPerson {

    static void main(String[] args) {

        def jsonFile = new File("src/com/nglcode/files/person.json").text
        def jsonSlurper = new JsonSlurper()
        def personData = jsonSlurper.parseText(jsonFile)

        println("Users: ${personData.id.size()}")
        personData.each {
            println("${it.id} - ${it.name.first_name} ${it.name.last_name}")
        }

        println("Third user: ${personData.name.first_name[2]}")
        println("First user last mane: ${personData.name[0].last_name}")

    }
}
