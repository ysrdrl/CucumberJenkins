package ApachePOI.Gun02;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02_Yazma {
    public static void main(String[] args) throws IOException {

        //Yazma
        //1. Yeniden excel oluşturup yazma
        //2. Varolan dosyaya yazma


        FileInputStream inputStream = new FileInputStream("src/test/java/ApachePOI/Resource/YeniExcel.xlsx");// Bizi excel dosyasına kadar götürüyor
        Workbook workbook = WorkbookFactory.create(inputStream);//Exceli açıyoruz
        Sheet sheet = workbook.getSheet("Sayfa1");//Shetimizi açıyoruz

        // Kendi Hafızasında Bir tane excel oluşturuyor

        String [][] array={ {"Yaşar","Samet","Nehir"},
                            {"Yaşar","Samet","Nehir"},
                            {"Yaşar","Samet","Nehir"}};


        for (int i = 0; i < array.length; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j <array[i].length ; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(array[i][j]);

            }

        }

        inputStream.close();

        // Artık yazabiliriz

        FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachePOI/Resource/YeniExcel.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();


    }
}
