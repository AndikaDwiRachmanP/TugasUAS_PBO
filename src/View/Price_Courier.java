package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class Price_Courier extends JFrame {
    private JButton btnCancel;
    private JButton btnOrder;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField txtFrom;
    private JTextField txtPrice;
    private JTextField txtTo;

    public Price_Courier() {
        this.initComponents();
    }

    private void initComponents() {
        this.txtFrom = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.txtTo = new JTextField();
        this.jLabel4 = new JLabel();
        this.jLabel3 = new JLabel();
        this.txtPrice = new JTextField();
        this.btnOrder = new JButton();
        this.btnCancel = new JButton();
        this.setDefaultCloseOperation(3);
        this.txtFrom.setText(" ");
        this.txtFrom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Price_Courier.this.txtFromActionPerformed(evt);
            }
        });
        this.jLabel1.setFont(new Font("Hobo Std", 1, 24));
        this.jLabel1.setText("TRANSPORTASI ONLINE");
        this.jLabel2.setFont(new Font("Hobo Std", 0, 12));
        this.jLabel2.setText("TO");
        this.txtTo.setText(" ");
        this.jLabel4.setFont(new Font("Hobo Std", 1, 24));
        this.jLabel4.setText("RP");
        this.jLabel3.setFont(new Font("Hobo Std", 1, 24));
        this.jLabel3.setText("TOTAL");
        this.txtPrice.setFont(new Font("Dialog", 0, 18));
        this.btnOrder.setFont(new Font("Hobo Std", 0, 14));
        this.btnOrder.setText("ORDER");
        this.btnCancel.setFont(new Font("Hobo Std", 0, 14));
        this.btnCancel.setText("CANCEL");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(104, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.btnCancel).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btnOrder).addGap(32, 32, 32)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.txtTo, -2, 170, -2).addComponent(this.jLabel4).addComponent(this.txtFrom, -2, 170, -2)).addGap(18, 18, 18))).addComponent(this.txtPrice, -2, 95, -2).addContainerGap()).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel2).addGap(201, 201, 201)))).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(34, 34, 34).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(46, 46, 46).addComponent(this.jLabel1)).addComponent(this.jLabel3, -2, 97, -2)).addContainerGap(52, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(77, 77, 77).addComponent(this.txtFrom, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.txtTo, -2, -1, -2).addGap(31, 31, 31).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.txtPrice, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, 41, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.btnOrder).addComponent(this.btnCancel)).addGap(25, 25, 25)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addComponent(this.jLabel1).addGap(125, 125, 125).addComponent(this.jLabel3, -2, 30, -2).addContainerGap(97, 32767))));
        this.pack();
    }

    private void txtFromActionPerformed(ActionEvent evt) {
    }

    public static void main(String[] args) {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Price_Courier.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Price_Courier.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Price_Courier.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Price_Courier.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Price_Courier()).setVisible(true);
            }
        });
    }

    public JButton getBtnCancel() {
        return this.btnCancel;
    }

    public JButton getBtnOrder() {
        return this.btnOrder;
    }

    public void addListener(ActionListener e) {
        this.btnOrder.addActionListener(e);
        this.btnCancel.addActionListener(e);
    }

    public JTextField getTxtFrom() {
        return this.txtFrom;
    }

    public JTextField getTxtPrice() {
        return this.txtPrice;
    }

    public JTextField getTxtTo() {
        return this.txtTo;
    }
}
