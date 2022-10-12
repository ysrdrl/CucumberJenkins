package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent {
    //last,first,getRow,getInt,getDouble
    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id,city,country_id,last_update from city");
        rs.last();// Sonuncu row'a gider.
        String id = rs.getString(1);
        System.out.println(id);
        int idint = rs.getInt(1);
        System.out.println(idint);

        String name = rs.getString(2);
        System.out.println(name);

        //int name1=rs.getInt(2);   !!!!     //Dönüşecek tip varsa dönüştürüyor.Yoksa hata veriyor.
        //System.out.println(name1);         //Hepsini string olarak alabilirsin.

        System.out.println(rs.getRow());
        //Dolayısıyla bir sorgunun sonucunda kaç satır geldiğini rs.last(); dedikten sonra getRow(); ile alabilirim.

        rs.first(); // İlk satıra gidiyor.

    }


}
