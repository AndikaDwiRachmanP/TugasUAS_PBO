package Controller;

import Model.PengemudiModel;
import View.Price_Pengemudi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import tugasbesar.Pengemudi;
import tugasbesar.Pesanan;

public class Price_PengemudiController implements ActionListener{
    Price_Pengemudi pp;
    private Pengemudi pe;
    private PengemudiModel pm;
    private Pesanan pes;

    public Price_PengemudiController(Pengemudi p, String idp) throws SQLException {
        this.pp.setVisible(true);
        this.pp.addListener(this);
        this.pe = p;
        this.pes = new Pesanan();
        this.pes = this.pm.getDetilPesanan(idp);
        this.pp.getTxtAsal().setText(this.pes.getAlamat_asal());
        this.pp.getTxtTujuan().setText(this.pes.getAlamat_tujuan());
        this.pp.getTxtTarif().setText(String.valueOf(this.pes.getTarif()));
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == this.pp.getBtnOrder()) {
            JOptionPane.showMessageDialog(this.pp, "Order telah sukses diambil");

            try {
                this.pm.takePesanan((int)this.pes.getId_pesanan(), this.pe.getId_pengemudi());
                new MenuPengemudiController(this.pe);
            } catch (SQLException var5) {
                System.err.println("Data error");
            }

            this.pp.dispose();
        } else if (e == this.pp.getBtnCancel()) {
            try {
                new MenuPengemudiController(this.pe);
                this.pp.dispose();
            } catch (SQLException var4) {
                System.err.println("Data error");
            }
        }

    }

}
