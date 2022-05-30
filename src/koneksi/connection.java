/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class connection {
  static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/karyawan";
    static final String user = "root";
    static final String pass = ""; 
    public Connection koneksi;
    public Statement statement;
    
    public connection(){
        try{
            Class.forName(driver);
            koneksi = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }  
}
