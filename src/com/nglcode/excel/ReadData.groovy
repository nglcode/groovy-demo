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

        

    }
}
