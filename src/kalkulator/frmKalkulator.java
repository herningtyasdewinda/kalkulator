package kalkulator;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frmKalkulator extends javax.swing.JDialog {
    private String tmp = "";
    private int pilih;
    private float a1,a2,hasil;

    public frmKalkulator(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtTampil.setHorizontalAlignment(JTextField.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTampil = new javax.swing.JTextField();
        btnSatu = new javax.swing.JButton();
        btnDua = new javax.swing.JButton();
        btnTiga = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnLima = new javax.swing.JButton();
        btnEmpat = new javax.swing.JButton();
        btnEnam = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnTujuh = new javax.swing.JButton();
        btnDelapan = new javax.swing.JButton();
        btnSembilan = new javax.swing.JButton();
        btnNol = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnSamaDengan = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSatu.setText("1");
        btnSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatuActionPerformed(evt);
            }
        });

        btnDua.setText("2");
        btnDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuaActionPerformed(evt);
            }
        });

        btnTiga.setText("3");
        btnTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTigaActionPerformed(evt);
            }
        });

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnLima.setText("5");
        btnLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimaActionPerformed(evt);
            }
        });

        btnEmpat.setText("4");
        btnEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpatActionPerformed(evt);
            }
        });

        btnEnam.setText("6");
        btnEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnamActionPerformed(evt);
            }
        });

        btnKurang.setText("-");

        btnTujuh.setText("7");
        btnTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTujuhActionPerformed(evt);
            }
        });

        btnDelapan.setText("8");
        btnDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelapanActionPerformed(evt);
            }
        });

        btnSembilan.setText("9");
        btnSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSembilanActionPerformed(evt);
            }
        });

        btnNol.setText("0");
        btnNol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNolActionPerformed(evt);
            }
        });

        btnKoma.setText(",");

        btnBersih.setText("c");

        btnBagi.setText(":");

        btnPlusMinus.setText("+/-");

        btnSamaDengan.setText("=");

        btnKali.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSamaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnNol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelapan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnBersih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah)
                            .addComponent(btnBagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtTampil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTampil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSatu)
                    .addComponent(btnDua)
                    .addComponent(btnTiga)
                    .addComponent(btnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLima)
                    .addComponent(btnEmpat)
                    .addComponent(btnEnam)
                    .addComponent(btnKurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTujuh)
                    .addComponent(btnDelapan)
                    .addComponent(btnSembilan)
                    .addComponent(btnKali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNol)
                    .addComponent(btnKoma)
                    .addComponent(btnBersih)
                    .addComponent(btnBagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlusMinus)
                    .addComponent(btnSamaDengan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatuActionPerformed
        tmp += "1";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnSatuActionPerformed

    private void btnDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuaActionPerformed
        tmp += "2";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnDuaActionPerformed

    private void btnTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTigaActionPerformed
        tmp += "3";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnTigaActionPerformed

    private void btnEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpatActionPerformed
        tmp += "4";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnEmpatActionPerformed

    private void btnLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimaActionPerformed
        tmp += "5";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnLimaActionPerformed

    private void btnEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnamActionPerformed
        tmp += "6";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnEnamActionPerformed

    private void btnTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTujuhActionPerformed
        tmp += "7";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnTujuhActionPerformed

    private void btnDelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelapanActionPerformed
        tmp += "8";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnDelapanActionPerformed

    private void btnSembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSembilanActionPerformed
       tmp += "9";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnSembilanActionPerformed

    private void btnNolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNolActionPerformed
        tmp += "0";
        txtTampil.setText(tmp);
    }//GEN-LAST:event_btnNolActionPerformed

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
            java.util.logging.Logger.getLogger(frmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmKalkulator dialog = new frmKalkulator(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnDelapan;
    private javax.swing.JButton btnDua;
    private javax.swing.JButton btnEmpat;
    private javax.swing.JButton btnEnam;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnLima;
    private javax.swing.JButton btnNol;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnSamaDengan;
    private javax.swing.JButton btnSatu;
    private javax.swing.JButton btnSembilan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTiga;
    private javax.swing.JButton btnTujuh;
    private javax.swing.JTextField txtTampil;
    // End of variables declaration//GEN-END:variables
}
