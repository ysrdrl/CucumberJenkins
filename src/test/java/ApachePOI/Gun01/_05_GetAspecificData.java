package ApachePOI.Gun01;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _05_GetAspecificData {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        String menu ="1.Username" +
                "\n2.Password" +
                "\n3.Address" +
                "\n4.Zipcode" +
                "\n5.City" +
                "\n6.State" +
                "\nÇıkış İçin Q'ya Basın...";

        while (true){
            System.out.println(menu);
            System.out.print("Lütfen İşlem Giriniz:");
            String islem=scan.nextLine();
            donenDeger(islem);
            if (islem.equalsIgnoreCase("q")){
                break;
            }
            System.out.println();

        }





    }

    public static void donenDeger(String kelime) {

        switch (kelime){
            case "1":
                kelime="username";
                break;
            case "2":
                kelime="password";
                break;
            case "3":
                kelime="address";
                break;
            case "4":
                kelime="zipcode";
                break;
            case "5":
                kelime="city";
                break;
            case "6":
                kelime="state";
                break;
        }

        ArrayList<String> list = new ArrayList<>();

        FileInputStream fileInputStream;
        Workbook workbook;


        {
            try {
                fileInputStream = new FileInputStream("src/test/java/ApachePOI/Resource/LoginData.xlsx");
                workbook = WorkbookFactory.create(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Sheet sheet = workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);


            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell= row.getCell(j);
                String strCCell=String.valueOf(cell);
                //System.out.print(cell+" ");

                if (strCCell.equalsIgnoreCase(kelime)){
                    for (int k = 1; k < row.getPhysicalNumberOfCells(); k++) {
                        Cell cell1= row.getCell(k);
                        list.add(String.valueOf(cell1));
                    }
                }

            }
            System.out.println();
        }

        listYazdir(list);
    }

    public static void listYazdir(ArrayList<String> liste){
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }

}
