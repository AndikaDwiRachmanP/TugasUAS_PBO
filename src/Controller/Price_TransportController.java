package Controller;

import Model.PesananModel;
import View.price_transport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tugasbesar.Pelanggan;
import tugasbesar.Pesanan;

public class Price_TransportController implements ActionListener{
    price_transport pt;
    private PesananModel pm;
    private Pelanggan p;
    private String asal;
    private String tujuan;
    private int jarak;

    public Price_TransportController(String asal, String tujuan, int km, Pelanggan p)
    {
        this.pt.setVisible(true);
        this.pt.addListener(this);
        this.pt.getTxtOrigin().setText(asal);
        this.pt.getTxtDestination().setText(tujuan);
        this.pt.getTxtHarga().setText("" + km * 4000);
        this.pm = new PesananModel();
        this.p = p;
        this.asal = asal;
        this.tujuan = tujuan;
        this.jarak = km;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == this.pt.getBtnOrder()) {
            Pesanan p = new Pesanan(this.tujuan, this.asal, "Pending", this.jarak);
            p.setTarif((int)Long.parseLong(this.pt.getTxtHarga().getText()));
            p.setJarak(this.jarak);
            this.pm.createPesanan(p, this.p.getId_pelanggan());
            JOptionPane.showMessageDialog(this.pt, "Order Pick Up Berhasil Dilakukan");
            new MenuPelangganController(this.p);
            this.pt.dispose();
        } else if (e == this.pt.getBtnCancel()) {
            JOptionPane.showMessageDialog(this.pt, "Order Pick Up Dibatalkan");
            new MenuPelangganController(this.p);
            this.pt.dispose();
        }
    }

}
