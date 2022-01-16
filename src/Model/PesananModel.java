package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tugasbesar.Pesanan;

public class PesananModel {
    private Koneksi conn;
    private Statement stmt;

    public PesananModel() {
        this.conn = new Koneksi();
        conn.bikinKoneksi();
    }

    public void createPesanan(Pesanan p, long id_pelanggan){
        try{
            stmt = conn.getConn().createStatement();
            String query = "Insert into pesanan (id_pelanggan,asal,tujuan,tarif,jarak,status,kategori) values("+id_pelanggan+",'"+p.getAlamat_asal()+"','"+p.getAlamat_tujuan()+"',"+p.getTarif()+","+p.getJarak()+",'"+p.getStatus()+"','Transport');";
            System.out.println(query);
            stmt.executeUpdate(query);
        }catch(SQLException e){
            System.err.println(e);
        }
    }

    public void createPesananKurir(Pesanan p, long id_pelanggan,String deskripsi){
        String id_pes = null;
        try{
            stmt = conn.getConn().createStatement();
            String query = "Insert into pesanan (id_pelanggan,asal,tujuan,tarif,jarak,status,kategori) values("+id_pelanggan+",'"+p.getAlamat_asal()+"','"+p.getAlamat_tujuan()+"',"+p.getTarif()+","+p.getJarak()+",'"+p.getStatus()+"','Kurir');";
            System.out.println(query);
            stmt.executeUpdate(query);
            //ambil id dan bikin di tabel kurir
            query = "select * from pesanan where id_pelanggan = "+id_pelanggan+" ORDER BY id_pesanan DESC LIMIT 1";
            ResultSet rs = stmt.executeQuery(query);
            if (rs != null && rs.next()) {
                rs.afterLast();
                while (rs.previous()) {
                    id_pes = rs.getString("id_pesanan");
                }
                query = "insert into kurir values("+id_pes+",'"+deskripsi+"')";
                stmt.executeUpdate(query);
            }else{
                System.err.println("Data tidak masuk");
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }

}
