package View;

import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JTable;

public class MenuPengemudi extends javax.swing.JFrame {
    private Vector<Vector<String>> pesananVektor = new Vector<Vector<String>>();
    private Vector<String> header;
    /**
     * Creates new form MenuPengemudi
     */
    public MenuPengemudi(Vector p) {

        header = new Vector<String>();
        header.add("Order ID");
        header.add("Category");
        header.add("Origin");
        header.add("Destination");
        header.add("Phone Number");
        header.add("Status");
        pesananVektor = p;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        txtinputid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnTakeOrder = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        jLabel1.setText("TRANSPORTASI ONLINE");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
                pesananVektor,header
        ));
        jScrollPane1.setViewportView(tblOrder);

        jLabel2.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        jLabel2.setText("Input ID:");

        btnTakeOrder.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        btnTakeOrder.setText("Take Order");

        btnLogout.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        btnLogout.setText("Log Out");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtinputid, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnLogout)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnTakeOrder)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtinputid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTakeOrder)
                                        .addComponent(btnLogout))
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTakeOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtinputid;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnTakeOrder
     */
    public javax.swing.JButton getBtnTakeOrder() {
        return btnTakeOrder;
    }

    public void addListener(ActionListener e)
    {
        btnTakeOrder.addActionListener(e);
        btnLogout.addActionListener(e);
    }

    /**
     * @return the btnLogout
     */
    public javax.swing.JButton getBtnLogout() {
        return btnLogout;
    }

    /**
     * @return the txtinputid
     */
    public javax.swing.JTextField getTxtinputid() {
        return txtinputid;
    }

    public JTable getTblOrder() {
        return tblOrder;
    }

    public void setTblOrder(JTable tblOrder) {
        this.tblOrder = tblOrder;
    }



}
