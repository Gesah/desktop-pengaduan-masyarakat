/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frame.views;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.kontrol.classapk.kontrol_petugas;
import com.placeholder.PlaceHolder;

/**
 *
 * @author HP
 */
public class loginpetugas extends javax.swing.JFrame {
    PlaceHolder pl;
    kontrol_petugas p;
    /**
     * Creates new form login
     */
    public loginpetugas() {
        initComponents();
       p = new kontrol_petugas();
       txthi.setVisible(false);
       pl = new PlaceHolder(txtusername,"Username");
       pl = new PlaceHolder(txtpassword,"Password");
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        cmblevel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txthi = new javax.swing.JLabel();
        txtlogin = new javax.swing.JLabel();
        cbkshow = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        txtusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/group_folder_20492.png"))); // NOI18N
        jButton3.setText("Menu HakAkses");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        cmblevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Hakakses", "Admin", "Petugas" }));
        cmblevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblevelActionPerformed(evt);
            }
        });
        getContentPane().add(cmblevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/animasi-bergerak-balon-0034.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 80, 140));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/iconfinder-social-media-work-4341270_120574.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 240, 180));

        txthi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txthi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txthi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 60, 20));

        txtlogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtlogin.setText("Login");
        getContentPane().add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 220, -1));

        cbkshow.setBackground(new java.awt.Color(255, 255, 255));
        cbkshow.setForeground(new java.awt.Color(255, 0, 0));
        cbkshow.setText("Lihat Password!");
        cbkshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/Eye_37136.png"))); // NOI18N
        cbkshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkshowActionPerformed(evt);
            }
        });
        getContentPane().add(cbkshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/wpid-kunci1.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 100, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/log_logout_door_1563.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 90, 30));

        txtpassword.setBorder(null);
        txtpassword.setEchoChar('*');
        txtpassword.setOpaque(false);
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, 30));

        txtusername.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtusername.setBorder(null);
        txtusername.setOpaque(false);
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusernameKeyReleased(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/background/frame/menu_login.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void cbkshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkshowActionPerformed
        // TODO add your handling code here:
        showpass();
    }//GEN-LAST:event_cbkshowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        // TODO add your handling code here:
        txthi.setVisible(true);
        txthi.setText("HI,");
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyReleased
        // TODO add your handling code here:
         txthi.setVisible(false);
        if(!txtusername.getText().equalsIgnoreCase("")){
            txtlogin.setText(txtusername.getText());
        } else {
            txtlogin.setText("LOGIN");
        }
    }//GEN-LAST:event_txtusernameKeyReleased

    private void cmblevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmblevelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         dispose();
        new pilihanmenu().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(loginpetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbkshow;
    private javax.swing.JComboBox<String> cmblevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txthi;
    private javax.swing.JLabel txtlogin;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

 public void login () {

    menuadmin u = new menuadmin();
    menupetugas s = new menupetugas();
    tanggapan t = new tanggapan(this, true);
    
    ResultSet rs;
    
    if(txtusername.getText().isEmpty() ||
       cmblevel.getSelectedItem().equals("") ||
       txtpassword.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane,"Username / Password harus diisi !","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtusername.requestFocus();
    } else {
        
        String username = txtusername.getText();
        String password = txtpassword.getText();
        String level = cmblevel.getSelectedItem().toString();
   
      try {
            rs = p.setlogin(username, password, level);
            if (rs.next()) {
                u.lblusername.setText(rs.getString("username"));
                u.lblhakakses.setText(rs.getString("level"));
                s.lblusername.setText(rs.getString("username"));
                s.lblhakakses.setText(rs.getString("level"));
                u.lblidadmin.setText(rs.getString("id_petugas"));
                s.lblidpetugas.setText(rs.getString("id_petugas"));
            
                if (rs.getString("level").equals("Admin")) {
                    u.setVisible(true);
                    t.txtidpetugas.setText(rs.getString("id_petugas"));
                    this.dispose();
                    
                }else if(rs.getString("level").equals("Petugas")){
                    s.setVisible(true);
                    t.txtidpetugas.setText(rs.getString("id_petugas"));
                    dispose();
                    
                }
                }else{
                JOptionPane.showMessageDialog(rootPane,"Username / Password tidak terdaftar","Peringatan",JOptionPane.WARNING_MESSAGE);
                txtusername.setText(null);
                txtpassword.setText(null);
                txtusername.requestFocus();
                txthi.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginpetugas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
 }
private void showpass(){
    if(cbkshow.isSelected()){
            txtpassword.setEchoChar((char)0);
        }else {
            txtpassword.setEchoChar('*');
        }
    }
}

