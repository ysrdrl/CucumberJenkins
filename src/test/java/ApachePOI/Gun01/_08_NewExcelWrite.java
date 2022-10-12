package ApachePOI.Gun01;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Apache");

        for (int i = 1; i < 10; i++) {
            row.createCell(i).setCellValue(i);
        }

        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/ApachePOI/Resource/YeniExcel.xlsx");
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();


        System.out.println("İşlem Tamamlandı...");


    }
}
