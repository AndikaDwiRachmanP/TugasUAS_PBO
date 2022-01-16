package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private Connection conn;
    public void bikinKoneksi(){
        try {
            //load jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        //buat objek koneksi
        try{
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_transportasi_online","root","");

        }catch(SQLException e){
            System.err.println("Koneksi gagal !!!!");
            System.err.println(e);
        }
    }

    public void tutupKoneksi(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            System.err.println("tidak ada koneksi yang terbuka");
        }
    }

    public Connection getConn() {
        return conn;
    }
}

