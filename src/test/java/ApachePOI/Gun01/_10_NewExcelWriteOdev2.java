package ApachePOI.Gun01;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _10_NewExcelWriteOdev2 {
    public static void main(String[] args) throws IOException {



    /*  Soru 2:
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
                *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
                */

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("CarpimTablosu");
        FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachePOI/Resource/Tablo2.xlsx");

        int sayac=1,sayacSıra=0;;
        for (int i = 0; i < 9; i++) {
            Row row= sheet.createRow(i);
            for (int j = 1; j < 54; j++) {
                Cell cell = row.createCell(j-1);
                if (j%6==0){
                    continue;
                }
                    if (sayacSıra==0) {
                        cell.setCellValue(String.valueOf(sayac));
                    }
                    if (sayacSıra==1) {
                        cell.setCellValue("X");
                    }
                    if (sayacSıra==2) {
                        cell.setCellValue(String.valueOf(i + 1));
                    }
                    if (sayacSıra==3) {
                        cell.setCellValue("=");
                    }
                    if (sayacSıra==4) {
                        cell.setCellValue(String.valueOf(sayac * (i + 1)));
                }
                sayacSıra++;
                    if (sayacSıra==5){
                        sayacSıra=0;
                        sayac++;
                    }

                    if (sayac==10){
                        sayac=1;
                    }
            }
        }

        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
}
