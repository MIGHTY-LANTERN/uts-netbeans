/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajar.java;

/**
 *
 * @author Asus
 */

import javax.swing.JOptionPane; 

public class JFrame_Kondisi extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Kondisi
     */
    public JFrame_Kondisi() {
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

        jLabel1 = new javax.swing.JLabel();
        btnMsgDialog = new javax.swing.JButton();
        btnInputDialog = new javax.swing.JButton();
        btnErrorDialog = new javax.swing.JButton();
        btnWarningDialog = new javax.swing.JButton();
        btnConfirmDialog = new javax.swing.JButton();
        btnOptionDialog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kotak Pesan (JOptionPane)");

        btnMsgDialog.setText("Dialog Message");
        btnMsgDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMsgDialogActionPerformed(evt);
            }
        });

        btnInputDialog.setText("Dialog Input");
        btnInputDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputDialogActionPerformed(evt);
            }
        });

        btnErrorDialog.setText("Dialog Error");
        btnErrorDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorDialogActionPerformed(evt);
            }
        });

        btnWarningDialog.setText("Dialog Warning");
        btnWarningDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarningDialogActionPerformed(evt);
            }
        });

        btnConfirmDialog.setText("Dialog Konfirmasi");
        btnConfirmDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDialogActionPerformed(evt);
            }
        });

        btnOptionDialog.setText("Dialog Pilihan");
        btnOptionDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMsgDialog)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnErrorDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnWarningDialog, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirmDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInputDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOptionDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMsgDialog)
                    .addComponent(btnInputDialog))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmDialog)
                    .addComponent(btnErrorDialog))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOptionDialog)
                    .addComponent(btnWarningDialog))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMsgDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMsgDialogActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Ini adalah Dialog Informasi");
    }//GEN-LAST:event_btnMsgDialogActionPerformed

    private void btnWarningDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarningDialogActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,
                "Ini adalah pesan Peringatan!", 
                "Warning", 
                JOptionPane.WARNING_MESSAGE);
                
    }//GEN-LAST:event_btnWarningDialogActionPerformed

    private void btnErrorDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorDialogActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
                "Ooopss...Ada kesalahan!", 
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnErrorDialogActionPerformed

    private void btnInputDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputDialogActionPerformed
        // TODO add your handling code here:
        String inputan = JOptionPane.showInputDialog("Inputkan Sesuatu");
        JOptionPane.showMessageDialog(this, "Kamu meng-inputkan: " + inputan);
    }//GEN-LAST:event_btnInputDialogActionPerformed

    private void btnConfirmDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmDialogActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(this, "Silahkan Konfirmasi");
        
       // 0 : yes
       // 1 : no
       // 2 : cancel
       switch (jawab) {
           case JOptionPane.YES_OPTION:
               JOptionPane.showMessageDialog(this, "Kamu menjawab ya");
               break;
           case JOptionPane.NO_OPTION:
               JOptionPane.showMessageDialog(this, "Kamu menjawab no");
               break;
           case JOptionPane.CANCEL_OPTION:
               JOptionPane.showMessageDialog(this, "Kamu menjawab batal");
       }
    }//GEN-LAST:event_btnConfirmDialogActionPerformed

    private void btnOptionDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionDialogActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showOptionDialog(this, 
                "Ingin Keluar?",
                "Keluar", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (jawab == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Program Akan Keluar");
            System.exit(0);
        }
    }//GEN-LAST:event_btnOptionDialogActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Kondisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Kondisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmDialog;
    private javax.swing.JButton btnErrorDialog;
    private javax.swing.JButton btnInputDialog;
    private javax.swing.JButton btnMsgDialog;
    private javax.swing.JButton btnOptionDialog;
    private javax.swing.JButton btnWarningDialog;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
