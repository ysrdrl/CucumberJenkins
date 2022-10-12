package _JDBC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.*;

public class JDBCParent {
    protected Connection connection;
    protected Statement statement;

    @BeforeTest
    public void DBConnectionOpen(){
        //Bağlantı işlemleri
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/z_yasar"; //hostname,port,db name(use db)
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
}
