package com.nglcode.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ReadData {

    static void main(String[] args) {

        def fis = new FileInputStream("src/com/nglcode/files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(1)
        def cell = row.getCell(0)

        def userName = cell.getStringCellValue()
        println("Username 1-0: ${userName}")

        cell = row.getCell(3)
        def numOfAttempts = cell.getNumericCellValue() as Integer
        println("NumOfAttempts 1-3: ${numOfAttempts}")

        cell = row.getCell(2)
        def dateCreated = cell.getDateCellValue()
        println("Date 1-2: ${dateCreated}")

        println("=============================")

        def eat = new ExcelApiTest("src/com/nglcode/files/TestData.xlsx")
        userName = eat.getCellData("Credentials", 1, 2)
        println("Username 2-1: ${userName}")

        numOfAttempts = eat.getCellData("Credentials", 4, 2)
        println("NumOfAttempts 2-4: ${numOfAttempts}")

        dateCreated = eat.getCellData("Credentials", 3, 2)
        println("Date 2-3: ${dateCreated}")



    }
}
