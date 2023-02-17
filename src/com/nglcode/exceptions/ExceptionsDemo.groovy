package com.nglcode.exceptions

class ExceptionsDemo {

    static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/com/nglcode/files/data1.properties")
        } catch (FileNotFoundException fnfe) {
//            fnfe.printStackTrace()
            println("File not found!")
        }

        try {
            int num = 2/0
            println("The value of i is: ${num}")
        } catch (ArithmeticException ae) {
            println("Can't divide by zero!")
        }

    }
}
