package Controller;

import Model.PengemudiModel;
import View.signin_pengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tugasbesar.Pengemudi;

public class Sign_PengemudiController implements ActionListener{
    signin_pengemudi sp = new signin_pengemudi();
    private PengemudiModel pm = new PengemudiModel();

    public Sign_PengemudiController()
    {
        this.sp.setVisible(true);
        this.sp.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == this.sp.getBtnlogin()) {
            if (!this.sp.getTxtusername().getText().isEmpty() && !this.sp.getTxtPass().getText().isEmpty()) {
                boolean log = false;

                try {
                    log = this.pm.cekPengemudi(this.sp.getTxtusername().getText(), this.sp.getTxtPass().getText());
                } catch (SQLException var6) {
                    System.err.println(var6);
                }

                if (log) {
                    System.out.println("Proses Pilih Menu");
                    JOptionPane.showMessageDialog(this.sp, "Log In Pengemudi Berhasil Dilakukan");

                    try {
                        Pengemudi p = this.pm.getDataPengemudi(this.sp.getTxtusername().getText(), this.sp.getTxtPass().getText());
                        new MenuPengemudiController(p);
                        this.sp.dispose();
                    } catch (SQLException var5) {
                        System.err.println("Data error");
                        System.out.println(var5);
                    }
                } else {
                    JOptionPane.showMessageDialog(this.sp, "Log In Pengemudi Gagal Dilakukan");
                }
            } else {
                JOptionPane.showMessageDialog(this.sp, "Data Pengemudi Tidak Boleh Kosong");
            }
        } else if (e == this.sp.getBtnBack()) {
            new Menu1Controller();
            this.sp.dispose();
        }
    }



}
