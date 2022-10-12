package _JDBC.Gun1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {

    private Connection connection;
    private Statement statement;
    @BeforeTest
    public void DBConnectionOpen(){
        //Bağlantı işlemleri
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hostname,port,db name(use db)
        String username="root";//Username
        String password="'\"-LhCB'.%k[4S]z";//Password

        try {
            connection= DriverManager.getConnection(url,username,password); //Connection
            statement=connection.createStatement(); //Sorguları çalıştırmak için page açıldı.

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @AfterTest
    public void DBConnectionClose(){
        //Close İşlemler
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    @Test
    public void test1() throws SQLException {
        //Sorgu burada çalışacak.
        ResultSet rs=statement.executeQuery("select * from language");
        rs.next();
        String dilAdi=rs.getString("name");
        System.out.println(dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println(dilAdi);
    }
    @Test
    public void test2() throws SQLException {
        //Sorgu burada çalışacak.
        ResultSet rs=statement.executeQuery("select * from language");
        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println(dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println(dilAdi);

    }

    @Test
    public void test3() throws SQLException {
        //Sorgu burada çalışacak.
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println(dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println(dilAdi);

        rs.previous();// Bir önceki satıra dönüyor.
        dilAdi=rs.getString(2);
        System.out.println(dilAdi);

    }


}
