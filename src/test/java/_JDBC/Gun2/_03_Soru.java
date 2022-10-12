package _JDBC.Gun2;

import Utilities.DBUtility;
import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class _03_Soru extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();
        //System.out.println(rsmd.getColumnCount()); // Kolon sayısını verir.
        //System.out.println(rsmd.getColumnName(1)); //Verilen indexteki kolunun adını verir.


        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i) + "   ");
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rs.getString(i) + "              ");
            }
            System.out.println();
        }
    }
    @Test
    public void test6() throws SQLException {

        ArrayList<ArrayList<String >> list=DBUtility.getDataList("select * from actor;");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.printf("%-13s",list.get(i).get(j));
            }
            System.out.println();
        }

    }

    @Test
    public void test2() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();
        //System.out.println(rsmd.getColumnCount()); // Kolon sayısını verir.
        //System.out.println(rsmd.getColumnName(1)); //Verilen indexteki kolunun adını verir.


        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.printf("%-13s",rsmd.getColumnName(i));
            //%:Değişkenin değerini işaret eder.
            //-:Sola dayalı yazdırır,default sağa dayalı yazdırır.
            //20:Kaç hane kullanılacak her zaman onun bilgisi
            //s :String değerler için 's' sayısal değerler için 'd' kullanılır.
            //"%5.2f":Sayı için 5hane kullan , ondalıklı kısım için 2 hane
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.printf("%-13s",rs.getString(i));
            }
            System.out.println();
        }

    }


    @Test
    public void test3() throws SQLException {
        // actor tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.
        sorgu("actor");
    }



    public void sorgu(String table) throws SQLException {
        ResultSet rs = statement.executeQuery("select * from "+table);
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.printf("%-13s",rsmd.getColumnName(i));
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.printf("%-13s",rs.getString(i));
            }
            System.out.println();
        }
    }



}
