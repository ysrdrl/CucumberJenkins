package ApachePOI.Gun01;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {

        //Var Olan Bir Excel Yazma İşlemi

        FileInputStream fileInputStream = new FileInputStream("src/test/java/ApachePOI/Resource/WriteInTheExcelFile.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("Sheet1");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Yasar");

        for (int i = 1; i < 10; i++) {
            row.createCell(i).setCellValue(i);
        }

        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/ApachePOI/Resource/WriteInTheExcelFile.xlsx");
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();


        System.out.println("İşlem Tamamlandı...");

    }
}
