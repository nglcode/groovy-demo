package com.nglcode.stringsdemo

class StringMethods {

    static main(args) {

        // String is immutable
        def s = "Groovy"
        def s1 = s.concat(" Program")

        println(s)
        println(s1)
        println("Length: " + s1.length())
        println("Char at pos. 5: " + s1.charAt(5))
        println("String contains " + s + ": " + s1.contains(s))
        println("String contains Potato : " + s1.contains("Potato"))
        println("String starts with " + s + ": " + s1.startsWith(s))
        println("String ends with Demo: " + s1.endsWith("Demo"))
        println("The index of y is: " + s1.indexOf('y'))


        def str1 = "Apache"
        def str2 = "Apache"
        def str3 = "apache"
        def str4 = ""
        def str5 = " Java   "
        def str6 = "First Second Third"

        println("Equals: " + str1.equals(str2))
        println("Equals: " + str1.equals(str3))
        println("Equal ignore case: " + str1.equalsIgnoreCase(str3))
        println("Empty: " + s1.isEmpty())
        println("Empty: " + str4.isEmpty())
        println("Replace: " + str3.replace("apache", "Java"))
        println("Substring: " + str2.substring(3,5))
        println("Lowercase: " + str1.toLowerCase())
        println("Uppercase: " + str1.toUpperCase())
        println("Trim: " + str5.trim())
        println("Split array: " + str6.split(" "))
        println("Split element: " + str6.split(" ")[0])

    }


}
