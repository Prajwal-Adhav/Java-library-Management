import java.sql.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author com
 */
public class DbConnection {
    Connection conn=null;
    
    public static Connection ConnectDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\com\\Documents\\NetBeansProjects\\Final AJP Project\\AddedBooks.db");
            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}
