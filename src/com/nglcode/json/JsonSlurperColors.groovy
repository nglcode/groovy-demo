package com.nglcode.json

import groovy.json.JsonSlurper

class JsonSlurperColors {

    static void main(String[] args) {

        def jsonFile = new File("src/com/nglcode/files/colors.json").text
        def jsonSlurper = new JsonSlurper()
        def content = jsonSlurper.parseText(jsonFile)

        def hexCodeList = []
        def typeContent = []

        content.colors.each {
            hexCodeList << it.code.hex
        }

        println(hexCodeList)
        println(hexCodeList[0])

        content.colors.each {
            typeContent << it.type
        }

        println(typeContent)


    }
}
