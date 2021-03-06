package View;

import java.awt.event.ActionListener;

public class Price_Pengemudi extends javax.swing.JFrame {


    public Price_Pengemudi() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrder = new javax.swing.JButton();
        txtTarif = new javax.swing.JTextField();
        txtTujuan = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TxtAsal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOrder.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        btnOrder.setText("ORDER");

        TxtAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAsalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Hobo Std", 0, 12)); // NOI18N
        jLabel2.setText("TO");

        jLabel1.setFont(new java.awt.Font("Hobo Std", 1, 24)); // NOI18N
        jLabel1.setText("TRANSPORTASI ONLINE");

        btnCancel.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        btnCancel.setText("CANCEL");

        jLabel3.setFont(new java.awt.Font("Hobo Std", 1, 18)); // NOI18N
        jLabel3.setText("Rp.");

        jLabel4.setFont(new java.awt.Font("Hobo Std", 1, 20)); // NOI18N
        jLabel4.setText("TOTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TxtAsal, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                        .addComponent(txtTujuan)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(192, 192, 192)
                                                .addComponent(jLabel2)))
                                .addContainerGap(69, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnCancel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnOrder))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(TxtAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnOrder)
                                        .addComponent(btnCancel))
                                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAsalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Price_Pengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Price_Pengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Price_Pengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Price_Pengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Price_Pengemudi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAsal;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtTarif;
    private javax.swing.JTextField txtTujuan;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnEdit
     */
    public javax.swing.JButton getBtnCancel() {
        return btnCancel;
    }

    /**
     * @return the btnOrder
     */
    public javax.swing.JButton getBtnOrder() {
        return btnOrder;
    }
    public void addListener(ActionListener e)
    {
        btnOrder.addActionListener(e);
        btnCancel.addActionListener(e);
    }

    /**
     * @return the TxtAsal
     */
    public javax.swing.JTextField getTxtAsal() {
        return TxtAsal;
    }

    /**
     * @param TxtAsal the TxtAsal to set
     */
    public void setTxtAsal(javax.swing.JTextField TxtAsal) {
        this.TxtAsal = TxtAsal;
    }

    /**
     * @return the txtTarif
     */
    public javax.swing.JTextField getTxtTarif() {
        return txtTarif;
    }

    /**
     * @param txtTarif the txtTarif to set
     */
    public void setTxtTarif(javax.swing.JTextField txtTarif) {
        this.txtTarif = txtTarif;
    }

    /**
     * @return the txtTujuan
     */
    public javax.swing.JTextField getTxtTujuan() {
        return txtTujuan;
    }

    /**
     * @param txtTujuan the txtTujuan to set
     */
    public void setTxtTujuan(javax.swing.JTextField txtTujuan) {
        this.txtTujuan = txtTujuan;
    }
}