package ApachePOI.Gun01;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_NewExcelWriteOdev1 {
    public static void main(String[] args) throws IOException {

        /*  Soru 1:
         *  Çarpım tablosunu excele yazdırınız.
         *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
         *  sıfırdan excel oluşturarak.
         *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
         */

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("CarpimTablosu");
        FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachePOI/Resource/Tablo.xlsx");

int sayac=1 , sayac2=1;
        for (int i = 1; i < 90; i++) {
            if (i%10==0){
                sayac=1;
                sayac2++;
                continue;
            }
            Row row=sheet.createRow(i-1);
            for (int j = 0; j < 5; j++) {
                Cell cell= row.createCell(j);
                if (j==0){
                    cell.setCellValue(String.valueOf(sayac2));
                }
                if (j==1){
                    cell.setCellValue("X");
                }
                if (j==2){
                    cell.setCellValue(String.valueOf(sayac));
                }
                if (j==3){
                    cell.setCellValue("=");
                }
                if (j==4){
                    cell.setCellValue(String.valueOf(sayac2*sayac));
                }
            }
            sayac++;
        }
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
}
