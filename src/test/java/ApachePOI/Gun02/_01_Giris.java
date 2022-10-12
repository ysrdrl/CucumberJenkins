package ApachePOI.Gun02;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_Giris {

    // Apeche ile excelden veri okuyoruz birde yazdırıyoruz.
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream=new FileInputStream("src/test/java/ApachePOI/Resource/Actor.xlsx");// Bizi excel dosyasına kadar götürüyor
        Workbook workbook= WorkbookFactory.create(inputStream);//Exceli açıyoruz
        Sheet sheet= workbook.getSheet("Actors");//Shetimizi açıyoruz




        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row= sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell= row.getCell(j);
                System.out.printf("%-15s",cell);
            }
            System.out.println();
        }







    }
}
