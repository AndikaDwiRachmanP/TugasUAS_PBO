package Controller;

import Model.PelangganModel;
import View.signin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tugasbesar.Pelanggan;

public class signinController implements ActionListener{
    signin s = new signin();
    private PelangganModel pm;
    public signinController() throws SQLException {
        this.s.setVisible(true);
        this.s.addListener(this);
        this.pm = new PelangganModel();
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == this.s.getLogin()) {
            if (!this.s.getTxtusername().getText().isEmpty() && !this.s.getTxtPass().getText().isEmpty()) {
                boolean log = false;

                try {
                    log = this.pm.cekPelanggan(this.s.getTxtusername().getText(), this.s.getTxtPass().getText());
                } catch (SQLException var7) {
                    System.err.println("Login gagal");
                }

                System.out.println(log);
                if (log) {
                    System.out.println("Proses Pilih Menu");
                    JOptionPane.showMessageDialog(this.s, "Log In Berhasil Dilakukan");

                    try {
                        Pelanggan p = this.pm.getDataPelanggan(this.s.getTxtusername().getText(), this.s.getTxtPass().getText());
                        new MenuPelangganController(p);
                        this.s.dispose();
                    } catch (SQLException var6) {
                        System.err.println("Data error");
                    }
                } else {
                    JOptionPane.showMessageDialog(this.s, "Log In Gagal Dilakukan");
                }
            } else {
                JOptionPane.showMessageDialog(this.s, "Data Pengguna tidak boleh kosong");
            }
        } else if (e == this.s.getSignupnow()) {
            System.out.println("Proses Sign Up Pelanggan");

            try {
                new signupController();
            } catch (SQLException var5) {
                System.err.println("Database Error");
            }

            this.s.dispose();
        }
    }

}
