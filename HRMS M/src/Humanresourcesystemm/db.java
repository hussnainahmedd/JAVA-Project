/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresourcesystemm;
import java.sql.*;
/**
 *
 * @author husss
 */

public class db {
    Connection conn = null;

    public static Connection db_java() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\PMYLS\\Documents\\NetBeansProjects\\HRMS\\HRMS\\HRMS.db");
            System.out.println("Connection Successful");

            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed " + e);
            return null;
        }
    }

    public static void main(String[] args) {
      db_java() ;
    }
}