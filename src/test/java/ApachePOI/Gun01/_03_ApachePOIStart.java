package ApachePOI.Gun01;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) {

        //Dosyanın yolu alındı
        String path="src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";

        Workbook calismaKitabi;

        try {

            //Java dosya okuma işlemcisine dosyanın yolunu veriyoruz;böylece program ile dosya arasında bağlantı oluştu.
            FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

            //Dosya okuma işlemcisi üzerinden Çalışma kitabını alıyorum.
            //Hafızada workbook'u alıp oluşturdu.
            calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //İstediğim isimdeki çalışma sayfasını alıyorum
        Sheet  calismaSayfasi=calismaKitabi.getSheet("Sheet1");

        //İstenen satırı alıyorum
        Row satir=calismaSayfasi.getRow(0);

        //İstenen hücreyi alıyorum
        Cell hücre= satir.getCell(0);

        System.out.println(hücre);






    }
}
