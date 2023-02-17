package com.nglcode.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class RowsAndColumns {

    static void main(String[] args) {

        def fis = new FileInputStream("src/com/nglcode/files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")
        def row = sheet.getRow(0)

        def colCount = row.getLastCellNum()
        println("Columns: ${colCount}")

        def rowCount = sheet.getLastRowNum()+1
        println("Rows: ${rowCount}")

        println("===============================")

        def eat = new ExcelApiTest("src/com/nglcode/files/TestData.xlsx")
        println("Column count: ${eat.getColumnCount("Credentials")}")
        println("Row count: ${eat.getRowCount("Credentials")}")



    }
}
