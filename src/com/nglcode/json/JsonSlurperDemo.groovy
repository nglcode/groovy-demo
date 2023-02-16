package com.nglcode.json

import groovy.json.JsonSlurper

class JsonSlurperDemo {

    static void main(String[] args) {

        def jsonSlurper = new JsonSlurper()

        def jsonSample = '''
          {
              "numeric": {
                "int": "10"
              },
                "float": "0.0f",
                "double": "0.0d",
                "boolean":true
          }'''
        def datatypes = jsonSlurper.parseText(jsonSample)
        println(datatypes)
        println("Integer: ${datatypes.numeric.int}")
        println("Boolean: ${datatypes.boolean}")
    }
}
