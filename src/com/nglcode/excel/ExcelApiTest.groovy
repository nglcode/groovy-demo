package com.nglcode.excel

import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.DateUtil
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory

import java.text.DateFormat
import java.text.SimpleDateFormat

class ExcelApiTest {

    XSSFWorkbook workbook = null
    XSSFSheet sheet = null
    XSSFRow row = null
    XSSFCell cell = null
    def xlsFilePath
    FileInputStream fis = null
    FileOutputStream fos = null

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

    def getCellData(sheetName, int colNum, int rowNum) {

        try {
            def cellValue
            sheet = workbook.getSheet(sheetName)
            row = sheet.getRow(rowNum - 1)
            cell = row.getCell(colNum - 1)

            println("Celltype: ${cell.getCellType()}")

            switch (cell.getCellType()) {
                case CellType.STRING:
                    cellValue = cell.getStringCellValue()
                    break
                case {CellType.NUMERIC || CellType.FORMULA}:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        DateFormat df = new SimpleDateFormat("dd/MM/yy")
                        Date date = cell.getDateCellValue()
                        cellValue = df.format(date)
                    } else {
                        cellValue = cell.getNumericCellValue()
                    }
                    break
                case CellType.BLANK:
                    cellValue = ""
                    break
                default:
                    cellValue = cell.getBooleanCellValue()
                    break
            }
            return cellValue
        } catch (Exception e) {
            e.printStackTrace()
            "Row: ${rowNum} or ColNum: ${colNum} does not exist in the Excel file."
        }
    }

    def getCellData(sheetName, String colName, int rowNum) {

        try {
            int colNum = -1
            sheet = workbook.getSheet(sheetName)
            row = sheet.getRow(0)
            def cellValue

            for (i in 0..row.getLastCellNum() -1 ) {
                if (row.getCell(i).getStringCellValue().trim() == colName) {
                    colNum = i
                    break
                }
            }

            row = sheet.getRow(rowNum - 1)
            cell = row.getCell(colNum)

            println("Celltype: ${cell.getCellType()}")

            switch (cell.getCellType()) {
                case CellType.STRING:
                    cellValue = cell.getStringCellValue()
                    break
                case {CellType.NUMERIC || CellType.FORMULA}:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        DateFormat df = new SimpleDateFormat("dd/MM/yy")
                        Date date = cell.getDateCellValue()
                        cellValue = df.format(date)
                    } else {
                        cellValue = cell.getNumericCellValue()
                    }
                    break
                case CellType.BLANK:
                    cellValue = ""
                    break
                default:
                    cellValue = cell.getBooleanCellValue()
                    break
            }
            return cellValue
        } catch (Exception e) {
            e.printStackTrace()
            "Row: ${rowNum} or ColName: ${colName} does not exist in the Excel file."
        }

    }

    def setCellData(sheetName, int colNum, int rowNum, value) {

        try {
            sheet = workbook.getSheet(sheetName)
            row = sheet.getRow(rowNum)

            if (row == null) {
                row = sheet.createRow(rowNum)
            }

            cell = row.getCell(colNum)

            if (cell == null) {
                cell = row.createCell(colNum)
            }

            cell.setCellValue(value)

            fos = new FileOutputStream(xlsFilePath)
            workbook.write(fos)
            fos.close()

            println("Success!")

        } catch (Exception e) {
            e.printStackTrace()
            false
        }
        true

    }

    def setCellData(sheetName, String colName, int rowNum, value) {

        try {
            def colNum = -1
            sheet = workbook.getSheet(sheetName)
            row = sheet.getRow(0)

            for (i in 0..row.getLastCellNum() -1) {
                println(row.getCell(i).getStringCellValue().trim())
                if (row.getCell(i).getStringCellValue().trim() == colName) {
                    colNum = i
                }
            }

            row = sheet.getRow(rowNum)

            if (row == null) {
                row = sheet.createRow(rowNum)
            }

            cell = row.getCell(colNum)

            if (cell == null) {
                cell = row.createCell(colNum)
            }

            cell.setCellValue(value)

            fos = new FileOutputStream(xlsFilePath)
            workbook.write(fos)
            fos.close()

            println("Success!")

        } catch (Exception e) {
            e.printStackTrace()
            false
        }
        true

    }




}
