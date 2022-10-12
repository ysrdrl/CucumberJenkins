package ApachePOI.Gun02;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _03_Olusturma {
    public static void main(String[] args) throws IOException {

        //Baştan oluşturma

        //Bir tane dosya oluştu
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Grup4");


// Burda java
        String[][] array = {{"1","Yaşar", "Samet", "Nehir"},
                            {"2","Yaşar", "Samet", "Nehir"},
                            {"3","Yaşar", "Samet", "Nehir"}};


        int sayac=1;
        for (int i = 0; i < array.length; i++) {
            Row row = sheet.createRow(i);//Bir yeri
            Cell cell ;

            for (int j = 0; j < array[i].length; j++) {
                cell = row.createCell(j);

                    cell.setCellValue(array[i][j]);
            }

        }


        // Yazöa işlemleri

        FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachePOI/Resource/Grup4.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }
}
