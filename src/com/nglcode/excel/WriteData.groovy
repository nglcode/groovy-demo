package com.nglcode.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class WriteData {

    static void main(String[] args) {

        def filePath = "src/com/nglcode/files/TestData.xlsx"
        def fis = new FileInputStream(filePath)
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        println("========Using ColNumber========")
        def row = sheet.getRow(1)

        if (row == null) {
            row = sheet.createRow(1)
        }

        def cell = row.getCell(4)

        if (cell == null) {
            cell = row.createCell(4)
        }

        cell.setCellValue("Pass")

        def fos = new FileOutputStream(filePath)
        workbook.write(fos)
        fos.close()

        println("Success!")

        println("=========================")

        def eat = new ExcelApiTest(filePath)
        eat.setCellData("Credentials", 4, 1, "Fail")

        println("========Using ColName========")

        eat = new ExcelApiTest(filePath)
        eat.setCellData("Credentials", "Result", 1, "PASS")



    }
}


