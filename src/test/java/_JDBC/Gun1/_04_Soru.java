package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCParent {
    // city tablosundaki tüm kayıtları next ile yazdırınız
    // city tablosundaki tüm kayıtları absolute ile yazdırınız
    // city tablosundaki tüm kayıtları relative ile yazdırınız.

    @Test
    public void cityTest() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from city");

        int sayac = 0;
        while (rs.next()) {
            String cityName = rs.getString(2);
            System.out.println("City Name:" + cityName);
            sayac++;
        }
        System.out.println("Şehir Sayısı:" + sayac);
    }

    @Test
    public void cityAbsolute() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        int sayac = 1;
        while (rs.absolute(sayac)) {
            String cityName = rs.getString(2);
            System.out.println("City Name:" + cityName);
            sayac++;
        }
        System.out.println("Şehir Sayısı:" + (sayac - 1));
    }

    @Test
    public void relativeCity() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        int sayac = 1, sayac1 = 0;
        while (rs.relative(sayac)) {
            String cityName = rs.getString(2);
            System.out.println("City Name:" + cityName);
            sayac1++;
        }
        System.out.println("Şehir Sayısı:" + (sayac1));
    }

}
