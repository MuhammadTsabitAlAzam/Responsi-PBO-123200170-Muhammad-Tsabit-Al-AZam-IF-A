/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author ASUS
 */
public class DetailKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form DetailKaryawan
     */
    public DetailKaryawan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txnama = new javax.swing.JTextField();
        txusia = new javax.swing.JTextField();
        txgaji = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txgaji1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kembali1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txnama.setText(" ");
        txnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnamaActionPerformed(evt);
            }
        });

        txusia.setText(" ");
        txusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txusiaActionPerformed(evt);
            }
        });

        txgaji.setText(" ");
        txgaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txgajiActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(102, 255, 102));
        submit.setText("Edit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 51, 51));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Detail Karyawan");

        kembali.setBackground(new java.awt.Color(51, 51, 255));
        kembali.setText("Kembali");

        jLabel2.setText("Nama");

        jLabel3.setText("Usia");

        jLabel4.setText("Gaji");

        txgaji1.setText(" ");
        txgaji1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txgaji1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Lembur");

        kembali1.setBackground(new java.awt.Color(255, 255, 51));
        kembali1.setText("Total Gaji");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txusia, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txnama)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txgaji1)
                                    .addComponent(txgaji))))
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kembali1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kembali)
                                .addGap(26, 26, 26)
                                .addComponent(submit)
                                .addGap(27, 27, 27)
                                .addComponent(reset)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txusia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txgaji1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(kembali1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembali)
                    .addComponent(submit)
                    .addComponent(reset))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnamaActionPerformed

    private void txusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txusiaActionPerformed

    private void txgajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txgajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txgajiActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String nama = txnama.getText().toString().trim();

        try{
            Connection c = Koneksi.getKoneksi();
            String sql = "INSERT INTO user VALUES (?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1,"");
            p.setString(2, nama);
            p.setString(3, usia);
            p.setString(4, gaji);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukkan Data");
        }catch(SQLException e){
            System.out.println("Error");
        }finally{
            this.dispose();
            TambahKaryawan a = new TambahKaryawan();
            a.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        txnama.setText("");
        txgaji.setText("");
        txusia.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void txgaji1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txgaji1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txgaji1ActionPerformed

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
            java.util.logging.Logger.getLogger(DetailKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton kembali;
    private javax.swing.JButton kembali1;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txgaji;
    private javax.swing.JTextField txgaji1;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txusia;
    // End of variables declaration//GEN-END:variables
}