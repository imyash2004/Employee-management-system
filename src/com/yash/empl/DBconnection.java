package com.yash.empl;
import java.sql.*;
public class DBconnection {
    static Connection con;
    public static Connection CreateDBconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student";
            String username ="root";
            String password ="vaibhavag";
            con=DriverManager.getConnection(url,username,password);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return con;
    }

}
