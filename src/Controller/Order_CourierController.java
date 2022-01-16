package Controller;

import Model.PesananModel;
import View.Order_Courier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tugasbesar.Pelanggan;

public class Order_CourierController implements ActionListener{
    Order_Courier oc;
    private PesananModel pm;
    private Pelanggan p;

    public Order_CourierController(Pelanggan p) {
        oc = new Order_Courier();
        oc.setVisible(true);
        oc.addListener(this);
        this.p = p;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object e = ae.getSource();
        if (e == oc.getBtnNext())
        {
            if (oc.getTxtfrom().getText().isEmpty() || oc.getTxtTo().getText().isEmpty() || oc.getTxtdesc().getText().isEmpty())
            {
                JOptionPane.showMessageDialog(oc,"Data Pesanan Tidak Boleh Kosong");
            }
            else{
                if (oc.getTxtfrom().getText().equals("Dago") && oc.getTxtTo().getText().equals("Riau"))
                {
                    new Price_CourierController(oc.getTxtfrom().getText(),oc.getTxtTo().getText(),15,this.p,oc.getTxtdesc().getText());
                    System.out.println("Order Berhasil Dilakukan");
                }
                oc.dispose();
            }
        }
        else if (e == oc.getBtnBack())
        {
            System.out.println("Order Dibatalkan");
            new MenuPelangganController(p);
        }
    }

}
