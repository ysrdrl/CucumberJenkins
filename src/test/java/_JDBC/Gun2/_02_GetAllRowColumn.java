package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs=statement.executeQuery("select* from language");
        ResultSetMetaData rsmd =rs.getMetaData();
       //System.out.println(rsmd.getColumnCount()); // Kolon sayısını verir.
       //System.out.println(rsmd.getColumnName(1)); //Verilen indexteki kolunun adını verir.

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print("Name:"+rsmd.getColumnName(i)+" ");
            System.out.print("Type:"+rsmd.getColumnTypeName(i));
            System.out.println();
        }
    }

}
