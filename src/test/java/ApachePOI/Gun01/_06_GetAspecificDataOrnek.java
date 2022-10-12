package ApachePOI.Gun01;

import io.cucumber.java.sl.Ce;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _06_GetAspecificDataOrnek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("Çıkış İçin Q'ya Baın..." +
                    "\nSütun Numarısnı Girin:");
            String sutunNo = scan.nextLine();
            if (sutunNo.equalsIgnoreCase("q")) {
                break;
            }
            excellDegerVoid(sutunNo);
        }


    }

    public static void excellDegerVoid(String deger){

        ArrayList<String > excellListe=new ArrayList<>();
        Workbook workbook;
        try {
            FileInputStream fileInputStream=new FileInputStream("src/test/java/ApachePOI/Resource/LoginData.xlsx");
            workbook=WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet=workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row= sheet.getRow(i);

                Cell cell= row.getCell(Integer.parseInt(deger)-1);
                if (cell==null){
                    continue;
                }
                System.out.print(cell);

            System.out.println();
        }
    }

}
