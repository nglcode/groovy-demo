package com.nglcode.stringsdemo

class StringsDemo {

    static main(args) {

        String strLiteral = "This is String literal"
        println(strLiteral)

        String strNew = new String("This is String with new keyword")
        println(strNew)

        // Groovy Strings
        def singleQuoteString = 'This is Single Quote string'
        println(singleQuoteString)

        def sampleWord = "Interpolation"
        def doubleQuoteString = "This is Double Quote string using ${sampleWord}"
        println(doubleQuoteString)

        def tripleQuoteString = '''\
This is Triple Quote string
with a new line'''
        println(tripleQuoteString)

        def tripleDoubleQuoteString = """This is Triple Double Quote string using ${sampleWord}
with another line"""
        println(tripleDoubleQuoteString)

        def slashyString = /This is Slashy String
and a new line with ${sampleWord}/
        println(slashyString)

        def dollarSlashyString = $/This is Dollar Slashy String, adding a slash /
and another line, this time with ${sampleWord}/$
        println(dollarSlashyString)

    }
}
