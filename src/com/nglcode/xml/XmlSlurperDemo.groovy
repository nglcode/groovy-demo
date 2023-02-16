package com.nglcode.xml

class XmlSlurperDemo {

    static void main(String[] args) {

        def stringXML = '''
               <person>
                   <firstName>Krishna</firstName>
                   <lastName>Sakinala</lastName>
                   <id>007</id>
               </person>
               '''
        def person = new XmlSlurper().parseText(stringXML)

        println(person.firstName)
        println(person.lastName)
        println(person.id)
    }
}
