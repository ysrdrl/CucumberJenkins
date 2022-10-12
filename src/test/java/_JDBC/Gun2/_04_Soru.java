package _JDBC.Gun2;

import Utilities.DBUtility;
import _JDBC.JDBCParent;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class _04_Soru extends JDBCParent {

    //SORU 1:getTable için yaptığın örneğin aynısını, bir XML file'den
    //sorguyu parametre olarak göndererek bir test için yazın.


    @Test
    @Parameters("sorgu")
    public void test1(String sorgu) throws SQLException {
        getTable(sorgu);
    }

    public void getTable(String sorgu) throws SQLException {
       // PreparedStatement statement;
        ResultSet rs = statement.executeQuery(sorgu);
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.printf("%-13s", rsmd.getColumnName(i));
        }
        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.printf("%-13s", rs.getString(i));
            }
            System.out.println();
        }
    }


    //SORU 2: Actor tablosundaki tüm verileri yeni excele yazdırınız.
    @Test
    public void test2() throws SQLException, IOException {
        excelWrite("select * from actor");
    }

    public void excelWrite(String sorgu) throws IOException, SQLException {

        ResultSet rs = statement.executeQuery(sorgu);
        ResultSetMetaData rsmd = rs.getMetaData();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Actors");

        Row row;
        Cell cell;
        row = sheet.createRow(0);
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            cell = row.createCell(i - 1);
            cell.setCellValue(rsmd.getColumnName(i));
        }
        int sayac = 1;
        while (rs.next()) {
            row = sheet.createRow(sayac);
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                row.createCell(i - 1).setCellValue(rs.getString(i));
            }
            sayac++;
        }

        FileOutputStream outputStream = new FileOutputStream("src/test/java/ApachePOI/Resource/Actor.xlsx");
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

    // Bu bilgilerin yerleşeceği tabloyu kendi DB nizde MySQL arayüzünden
    // oluşturup. Burada JDBC üserinden aşağıdaki bilgileri okuyarak.
    // tabloya insert ediniz. (JDBC Mysql insert komutunun nasıl çalıştırılacağı
    // internetten araştırılacak.)
    // SORU 3: Bir excelde aşağıdaki bilgiler vardır;
    // No    ,    Ad     ,    Soyad  ,   Telefon
    //         1         Yaşar       DERELİ      05555555555
    //         2         İsmet       TEMUR       05344444444
    //         3         Mehmet      YILMAZ      05333333333
    //         4         Ayşe        YILDIZ      05311111111
    //         5         Ali         VELİ        05388888888

    @Test
    public void test3() throws SQLException {


        String [] queryActor={"insert into actor(ad,soyad,telefon) VALUES ('Yaşar','DERELİ','05555555555')",
        "insert into actor(ad,soyad,telefon) VALUES ('İsmet','TEMUR','05344444444')",
        "insert into actor(ad,soyad,telefon) VALUES ('Mehmet','YILMAZ','05333333333')",
        "insert into actor(ad,soyad,telefon) VALUES ('Ayşe','YILDIZ','05311111111')",
        "insert into actor(ad,soyad,telefon) VALUES ('Ali','VELİ','05388888888')"};

        insertDB(queryActor);

    }

    public void insertDB(String[] query) throws SQLException {

        for (int i = 0; i < query.length; i++) {
            statement.executeUpdate(query[i]);
        }


    }


}
