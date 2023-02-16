package com.nglcode.properties

class ReadProperties {

    static void main(String[] args) {

        def reader = new FileReader("src/com/nglcode/files/data.properties")
        def properties = new Properties()

        properties.load(reader)
        println("Email: ${properties.getProperty("email")}")
        println("Password: ${properties.getProperty("password")}")
        println("Phone: ${properties.getProperty("phone")}")
    }
}
