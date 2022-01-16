package Controller;

import Model.PesananModel;
import View.Price_Courier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tugasbesar.Pelanggan;
import tugasbesar.Pesanan;

public class Price_CourierController implements ActionListener{
    Price_Courier pc;
    private PesananModel pm;
    private Pelanggan p;
    private String asal;
    private String tujuan;
    private int jarak;
    private String deskripsi;

    public Price_CourierController(String asal, String tujuan, int km,Pelanggan p, String deskripsi) {
        this.pc = new Price_Courier();
        this.pc.setVisible(true);
        this.pc.addListener(this);
        this.pc.getTxtFrom().setText(asal);
        this.pc.getTxtTo().setText(tujuan);
        this.pc.getTxtPrice().setText(""+((km*4000)+5000));
        this.pm = new PesananModel();
        this.p = p;
        this.asal = asal;
        this.tujuan = tujuan;
        this.jarak = km;
        this.deskripsi = deskripsi;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == pc.getBtnOrder())
        {
            Pesanan p = new Pesanan(tujuan,asal,"Pending", jarak);
            p.setTarif((int) Long.parseLong(pc.getTxtPrice().getText()));
            pm.createPesananKurir(p, this.p.getId_pelanggan(),deskripsi);
            JOptionPane.showMessageDialog(pc,"Order Courier Berhasil Dilakukan");
            new MenuPelangganController(this.p);
            pc.dispose();
        }
        else if(e == pc.getBtnCancel())
        {
            JOptionPane.showMessageDialog(pc,"Order Courier Dibatalkan");
            new MenuPelangganController(p);
            pc.dispose();
        }
    }

}
