package com.nglcode.xml

import groovy.json.JsonSlurper

class XmlSlurperBooks {

    static void main(String[] args) {


        def xmlFile = new File("src/com/nglcode/files/books.xml").text
        def xmlSlurper = new XmlSlurper()
        def booksData = xmlSlurper.parseText(xmlFile)

        def authorList = []

        booksData.book.each {
            println(it.author)
            authorList << it.author
        }

        println(booksData)
        println(authorList)
        println(authorList[0])
        println(booksData.book.author.size())
        println(booksData.book[10].author)

        def priceTypes = booksData.book.price.@type as List
        println(priceTypes)

        println("First book price type: ${booksData.book[0].price.@type}")

        def rupeeInfo = booksData.book.'*'.findAll { node ->
            node.name() == 'price' && node.@type == 'rupee'
        } as List
        println(rupeeInfo)






    }

}
