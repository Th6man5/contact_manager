/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection; // Pastikan ini dari java.sql
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raihan
 * @version 23
 */
/**
 * Class Koneksi digunakan untuk mengconect ke dalam MySQL Database
 */
public class Koneksi {
    /**
     * Digunakan untuk menyimpan koneksi database
     */
    private static Connection conn;

    /**
     * membuat koneksi baru ke database MySQL yang ditentukan.
     * 
     * @return Koneksi database aktif.
     */
    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/contact_manager";
                String user = "root"; 
                String pass = ""; 

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                conn = DriverManager.getConnection(url, user, pass);
                
            } catch (SQLException e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conn;
    }
}


