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
public class EditKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form EditKaryawan
     */
    public EditKaryawan() {
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
        txnama1 = new javax.swing.JTextField();
        txusia1 = new javax.swing.JTextField();
        txgaji1 = new javax.swing.JTextField();
        submit1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        kembali1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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
        submit.setText("Submit");
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
        jLabel1.setText("Tambah Karyawan");

        kembali.setBackground(new java.awt.Color(51, 51, 255));
        kembali.setText("Kembali");

        jLabel2.setText("Nama");

        jLabel3.setText("Usia");

        jLabel4.setText("Gaji");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txnama1.setText(" ");
        txnama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnama1ActionPerformed(evt);
            }
        });

        txusia1.setText(" ");
        txusia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txusia1ActionPerformed(evt);
            }
        });

        txgaji1.setText(" ");
        txgaji1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txgaji1ActionPerformed(evt);
            }
        });

        submit1.setBackground(new java.awt.Color(102, 255, 102));
        submit1.setText("Submit");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });

        reset1.setBackground(new java.awt.Color(255, 51, 51));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Edit Karyawan");

        kembali1.setBackground(new java.awt.Color(51, 51, 255));
        kembali1.setText("Kembali");

        jLabel6.setText("Nama");

        jLabel7.setText("Usia");

        jLabel8.setText("Gaji");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txusia1)
                            .addComponent(txnama1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submit1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(reset1))
                            .addComponent(txgaji1)
                            .addComponent(kembali1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txnama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txusia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txgaji1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit1)
                    .addComponent(reset1))
                .addGap(18, 18, 18)
                .addComponent(kembali1)
                .addContainerGap(29, Short.MAX_VALUE))
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
        String usia = txusia.getText().toString().trim();
        String gaji = txgaji.getText().toString().trim();

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

    private void txnama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnama1ActionPerformed

    private void txusia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txusia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txusia1ActionPerformed

    private void txgaji1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txgaji1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txgaji1ActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        String nama = txnama.getText().toString().trim();
        String usia = txusia.getText().toString().trim();
        String gaji = txgaji.getText().toString().trim();

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
    }//GEN-LAST:event_submit1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        txnama.setText("");
        txgaji.setText("");
        txusia.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_reset1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton kembali;
    private javax.swing.JButton kembali1;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit1;
    private javax.swing.JTextField txgaji;
    private javax.swing.JTextField txgaji1;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnama1;
    private javax.swing.JTextField txusia;
    private javax.swing.JTextField txusia1;
    // End of variables declaration//GEN-END:variables
}