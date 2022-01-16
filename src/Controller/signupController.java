package Controller;

import Model.PelangganModel;
import View.signup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tugasbesar.Pelanggan;
public class signupController implements ActionListener{
    signup su = new signup();
    private PelangganModel pelModel = new PelangganModel();

    public signupController() throws SQLException
    {
        this.su.setVisible(true);
        this.su.addListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == this.su.getBtnsignup()) {
            if (!this.su.getTxtname().getText().isEmpty() && !this.su.getTxtPass().getText().isEmpty() && !this.su.getTxtusername().getText().isEmpty() && !this.su.getTxtphone().getText().isEmpty()) {
                long telp = Long.parseLong(this.su.getTxtphone().getText());
                long id = 0L;
                Pelanggan p = new Pelanggan(this.su.getTxtname().getText(), telp, this.su.getTxtAddress().getText(), id, this.su.getTxtusername().getText(), this.su.getTxtPass().getText());
                this.pelModel.tambahPelanggan(p);
                JOptionPane.showMessageDialog(this.su, "Sign Up berhasil dilakukan");
                new MenuPelangganController(p);
                this.su.setVisible(false);
                this.su.dispose();
            } else {
                JOptionPane.showMessageDialog(this.su, "Data Pengguna tidak boleh kosong");
            }
        } else if (e == this.su.getBtnloginnow()) {
            System.out.println("Loading.....");

            try {
                new signinController();
            } catch (SQLException var8) {
                System.err.println("Database Error");
            }

            this.su.dispose();
        }
    }
}