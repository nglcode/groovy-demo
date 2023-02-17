package com.nglcode.excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ExcelApiTest {

    def workbook
    def sheet
    def row
    def cell
    def xlsFilePath
    def fis
    def fos

    def ExcelApiTest(xlsFilePath) {
        this.xlsFilePath = xlsFilePath
        fis = new FileInputStream(xlsFilePath)
        workbook = new XSSFWorkbook(fis)
        fis.close()
    }

    def getRowCount(sheetName) {
        sheet = workbook.getSheet(sheetName)
        sheet.getLastRowNum()+1
    }

    def getColumnCount(sheetName) {
        sheet = workbook.getSheet(sheetName)
        row = sheet.getRow(0)
        row.getLastCellNum()
    }




}
