/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;


import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class javaConnect{
    Connection conn;
public static Connection ConnecrDb(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/librarydbmgmt","root","");
        
        //System.out.println("Database is connected !");
        return conn;
        } catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;  
        }
    } 
}
