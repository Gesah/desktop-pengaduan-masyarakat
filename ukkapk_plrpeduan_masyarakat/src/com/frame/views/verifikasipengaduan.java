/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frame.views;
import com.kontrol.classapk.kontrol_verifikasidanvalidasi;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class verifikasipengaduan extends javax.swing.JDialog {
       kontrol_verifikasidanvalidasi v;
       ResultSet rs;
       String idpengaduan, status;
    /**
     * Creates new form verifikasipengaduan
     */
    public verifikasipengaduan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        v = new kontrol_verifikasidanvalidasi(); 
        tampildata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidpengaduan = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        txttglpengaduan = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtisilaporan = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_verifikasi = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        txtidpengaduan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpengaduanActionPerformed(evt);
            }
        });

        txtisilaporan.setColumns(20);
        txtisilaporan.setRows(5);
        jScrollPane2.setViewportView(txtisilaporan);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Verifikasi Data Pengaduan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        tabel_verifikasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pengaduan", "Tanggal Pengaduan", "NIK", "Isi Laporan", "Foto", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_verifikasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_verifikasiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_verifikasi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 810, 230));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/Preview.png"))); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 80, 30));

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
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 130, 20));

        jLabel2.setText("Cari Berdasarkan NIK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/businessapplication_accept_ok_male_man_you_negocio_2311.png"))); // NOI18N
        jButton2.setText("Verifikasi Pengaduan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void tabel_verifikasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_verifikasiMouseClicked
        // TODO add your handling code here:
        setformtable();
    }//GEN-LAST:event_tabel_verifikasiMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updatedata();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtidpengaduanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpengaduanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpengaduanActionPerformed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        // TODO add your handling code here:
        tampildata();
    }//GEN-LAST:event_txtcariKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(verifikasipengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verifikasipengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verifikasipengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verifikasipengaduan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                verifikasipengaduan dialog = new verifikasipengaduan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblfoto;
    private javax.swing.JTable tabel_verifikasi;
    private javax.swing.JTextField txtcari;
    public javax.swing.JTextField txtidpengaduan;
    public javax.swing.JTextArea txtisilaporan;
    public javax.swing.JTextField txtnik;
    public javax.swing.JTextField txtstatus;
    private com.toedter.calendar.JDateChooser txttglpengaduan;
    // End of variables declaration//GEN-END:variables

private void updatedata() {
        
        String data = "Proses";
        idpengaduan = txtidpengaduan.getText();
        status = txtstatus.getText();
        status = data;
        
        int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan mengubah data ini ?","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
        if (conf == 0) {
            v.updatedata(idpengaduan, status);
            tampildata();
           
        }
    }
private void setformtable() {
     
     int baris = tabel_verifikasi.getSelectedRow();
        String satu =(String)tabel_verifikasi.getValueAt(baris,0);
        String dua =(String)tabel_verifikasi.getValueAt(baris,1);
        String tiga =(String)tabel_verifikasi.getValueAt(baris,2);
        String empat =(String)tabel_verifikasi.getValueAt(baris,3);
        String lima =(String)tabel_verifikasi.getValueAt(baris,4);
        String enam =(String)tabel_verifikasi.getValueAt(baris,5);
        

         SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date dateValue = null;
        try{
            dateValue = date.parse((String)tabel_verifikasi.getValueAt(baris, 1));
        } catch (ParseException ex){
            Logger.getLogger(verifikasipengaduan.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtidpengaduan.setText(satu);
        txttglpengaduan.setDate(dateValue);
        txtnik.setText(tiga);
        txtisilaporan.setText(empat);
        lblfoto.setText(lima);
        txtstatus.setText(enam);
        
}
private void cari(){
   String cari = txtcari.getText();
   DefaultTableModel dtm = (DefaultTableModel) tabel_verifikasi.getModel();
   dtm.setRowCount(0);
   ResultSet rs = v.caridata(dtm, cari);
   tabel_verifikasi.setModel(dtm);
 }
private void tampildata () {
    DefaultTableModel dtm = (DefaultTableModel) tabel_verifikasi.getModel();
    dtm.setRowCount(0);
    v.tampildata(dtm);
    tabel_verifikasi.setModel(dtm);
 }
}
