package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void test1()  {

        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hostname,port,db name(use db)
        String username="root";//Username
        String password="'\"-LhCB'.%k[4S]z";//Password
        Connection connection;
        Statement statement;
        ResultSet rs;
        try {
            connection= DriverManager.getConnection(url,username,password); //Connection
            statement=connection.createStatement(); //Sorguları çalıştırmak için page açıldı.
            rs=statement.executeQuery("select * from actor"); // Sorgu sonucu oluştu ama db'de bekliyor.
            rs.next();
            String firstName=rs.getString("first_name");
            String lastName=rs.getString("last_name");
            System.out.println("AD:"+firstName+" ");
            System.out.println("SOYAD:"+lastName);

            //2.SATIR

            rs.next();
            firstName=rs.getString("first_name");
            lastName=rs.getString("last_name");
            System.out.println("AD:"+firstName+" ");
            System.out.println("SOYAD:"+lastName);

            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }

}
