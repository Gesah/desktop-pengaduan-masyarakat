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
import javax.swing.table.DefaultTableModel;
import com.kontrol.classapk.kontrol_petugas;
/**
 *
 * @author HP
 */
public class privilage extends javax.swing.JDialog {
    kontrol_petugas p;
    String idpetugas, namapetugas, username, password, telp, level;
    ResultSet rs; 
    
    /**
     * Creates new form privilage
     */
    public privilage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         p = new kontrol_petugas();
        tampildata();
        setobjek(false);
        btntambah.setEnabled(true);
        btnupdate.setEnabled(false);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(false);
        btncancel.setVisible(false);
  
        }
        
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        txttelp = new javax.swing.JTextField();
        itemlevel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        btnhapus = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("| Input Data Privilege |");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, -1));
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, -1));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));

        txtpassword.setEchoChar('*');
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));
        jPanel1.add(txttelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, -1));

        itemlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Level", "Admin", "Petugas" }));
        itemlevel.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                itemlevelPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        itemlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlevelActionPerformed(evt);
            }
        });
        jPanel1.add(itemlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 100, -1));

        jLabel1.setText("ID                   ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel2.setText("Nama Level     ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jLabel3.setText("Nama              ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel4.setText("Username      ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel5.setText("Password        ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel6.setText("No Telepon    ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Nama", "Username", "Password", "Telp", "Level"
            }
        ));
        table_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_user);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 550, 130));

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 100, 30));

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel1.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, 30));

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 100, 30));

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/62835floppydisk_109229.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, 30));

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/pencil.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 420, -1));

        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/forbidden_40630.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/iconfinder-green-work-4341273_120576.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 310, 240));

        txtcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtcariMouseReleased(evt);
            }
        });
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 140, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/business_man_usersearch_thesearch_theclient_2356.png"))); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, 30));

        jLabel8.setText("Cari Berdasarkan Username");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void itemlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemlevelActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
         hapusdata();
        btntambah.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnupdate.setEnabled(false);
        btnedit.setEnabled(false);
        btncancel.setVisible(false);
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
         baru();
        setobjek(true);
        txtid.requestFocus();
        btnsimpan.setEnabled(true);
        btnupdate.setEnabled(false);
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
        btnupdate.setEnabled(false);
        btncancel.setVisible(false);
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        updatedata();
        btnupdate.setEnabled(true);
        btnedit.setEnabled(false);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btntambah.setEnabled(true);
        btncancel.setVisible(false);
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        simpandata();
        btntambah.setEnabled(true);
        btnsimpan.setEnabled(true);
        btnhapus.setEnabled(false);
        btnupdate.setEnabled(false);
        btnedit.setEnabled(false);
        btncancel.setVisible(false);
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        setobjek(true);
        btnedit.setVisible(true);
        btnupdate.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btntambah.setEnabled(false);
        btncancel.setVisible(true);
    }//GEN-LAST:event_btneditActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked
        // TODO add your handling code here:
         setformtable();
        btntambah.setEnabled(true);
        btnedit.setEnabled(true);
        btnhapus.setEnabled(true);
        btnupdate.setEnabled(false);
        btnsimpan.setEnabled(false);
        btncancel.setVisible(false);
    }//GEN-LAST:event_table_userMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
          baru();
          
        itemlevel.setEnabled(true);
        btntambah.setEnabled(true);
        btnupdate.setEnabled(false);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(true);
        btncancel.setVisible(false);
        
    }//GEN-LAST:event_btncancelActionPerformed

    private void itemlevelPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_itemlevelPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
       
    }//GEN-LAST:event_itemlevelPopupMenuWillBecomeInvisible

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtcariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcariMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariMouseReleased

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        // TODO add your handling code here:
        tampildata();
    }//GEN-LAST:event_txtcariKeyReleased

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
            java.util.logging.Logger.getLogger(privilage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(privilage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(privilage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(privilage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                privilage dialog = new privilage(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> itemlevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

   private void simpandata() {
        idpetugas = txtid.getText(); 
        namapetugas = txtnama.getText();
        username = txtusername.getText();
        password = txtpassword.getText();
        telp = txttelp.getText();
        level = (String) itemlevel.getSelectedItem();
        
        if (txtid.getText().isEmpty() ||
            txtnama.getText().isEmpty() ||
            txtusername.getText().isEmpty() || 
            txtpassword.getText().isEmpty() || 
            txttelp.getText().isEmpty() ||
            itemlevel.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane,"Silahkan isi data terlebih dahulu !","Informasi",JOptionPane.INFORMATION_MESSAGE);
        } else {
            p.simpandata(idpetugas, namapetugas, username, password, telp, level);
            JOptionPane.showMessageDialog(rootPane,"Data berhasil disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
            tampildata();
            baru();
            setobjek(false);
        }
        
 }
private void tampildata () {
    DefaultTableModel dtm = (DefaultTableModel) table_user.getModel();
    dtm.setRowCount(0);
    p.tampildata(dtm);
    table_user.setModel(dtm);
}

private void setformtable() {
     txtid.setText(table_user.getValueAt(table_user.getSelectedRow(), 0).toString());
     txtnama.setText(table_user.getValueAt(table_user.getSelectedRow(), 1).toString());
     txtusername.setText(table_user.getValueAt(table_user.getSelectedRow(), 2).toString());
     txtpassword.setText(table_user.getValueAt(table_user.getSelectedRow(), 3).toString());
     txttelp.setText(table_user.getValueAt(table_user.getSelectedRow(), 4).toString());
    try {
            
            ResultSet rs = p.caridivision(table_user.getValueAt(table_user.getSelectedRow(), 5).toString());
            while(rs.next()){
                itemlevel.setSelectedItem(rs.getString("level"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(privilage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
     

private void hapusdata() {
    idpetugas = txtid.getText();
    
    int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan menghapus data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if (conf == 0) {
        p.hapusdata(idpetugas);
    JOptionPane.showMessageDialog(rootPane,"Data berhasil dihapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
    tampildata();
        baru();
        setobjek(false);
    }
    
} 

private void updatedata() {
        idpetugas = txtid.getText();
        namapetugas = txtnama.getText();
        username = txtusername.getText();
        password = txtpassword.getText();
        telp = txttelp.getText();
        level = (String) itemlevel.getSelectedItem();
        
        int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan mengubah data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
            p.updatedata(idpetugas, namapetugas, username, password, telp, level);
            tampildata();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diubah","Informasi",JOptionPane.INFORMATION_MESSAGE);
            baru();
            setobjek(false);
        }
    }
 private void cari() {
     String cari = txtcari.getText();
     DefaultTableModel dtm = (DefaultTableModel) table_user.getModel();
     dtm.setRowCount(0);
     ResultSet rs = p.caridata(dtm, cari);
     table_user.setModel(dtm);
 }
private void baru() {
    txtid.setText(null);
    txtnama.setText(null);
    txtusername.setText(null);
    txtpassword.setText(null);
    txttelp.setText(null);
    itemlevel.setSelectedIndex(0);
}

private void setobjek(boolean b) {
    txtid.setEnabled(b);
    txtnama.setEnabled(b);
    txtusername.setEnabled(b);
    txtpassword.setEnabled(b);
    txttelp.setEnabled(b);
    itemlevel.setEnabled(b);

  }
}    
    
