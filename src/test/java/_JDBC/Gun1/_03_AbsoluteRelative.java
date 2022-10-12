package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {

    @Test
    public void Test1() throws SQLException {
        // next(): Bir sonraki row.
        // previus(): Bir önceki row.
        // absolute(4): Baştan itibaren direkt 4.row'a gider.
        // relative(4): Bulunduğu noktadan 4 adım sonraki row'a gider.

        ResultSet rs=statement.executeQuery("select * from film");
        rs.absolute(10);//Baştan 10. satıra git.
        String title= rs.getString("title");
        System.out.println(title);

        rs.absolute(15);//Baştan 15. satıra git.
        title= rs.getString("title");
        System.out.println(title);

        rs.absolute(-15);//Sondan (-)15. satıra git.
        title= rs.getString("title");
        System.out.println(title);

        rs.relative(5);//En son bulunduğun yerden 5 adım ileri git.
        title= rs.getString("title");
        System.out.println(title);

        rs.relative(-5);//En son bulunduğun yerden 5 adım geri git.
        title= rs.getString("title");
        System.out.println(title);


    }

}
