/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frame.views;

import javax.swing.table.DefaultTableModel;
import com.kontrol.classapk.kontrol_pengaduan;
import com.kontrol.classapk.kontrol_tanggapan;
import com.kontrol.classapk.kontrol_verifikasidanvalidasi;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class tanggapan extends javax.swing.JDialog {
       kontrol_pengaduan p;
       String idtanggapan, idpengaduan, tgltanggapan, tanggapan, idpetugas;
       String idpengaduan2, status;
       kontrol_tanggapan t;
       kontrol_verifikasidanvalidasi v;
       ResultSet rs;
    /**
     * Creates new form tanggapan
     */
    public tanggapan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         p = new kontrol_pengaduan();
         t = new kontrol_tanggapan();
         v = new kontrol_verifikasidanvalidasi();
      txtidpetugas.setEnabled(false);
      txtidpengaduan.setEnabled(false);
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

        txtstatus = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        txttglpengaduan = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtisilaporan = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtidtanggapan = new javax.swing.JTextField();
        txttgltanggapan = new com.toedter.calendar.JDateChooser();
        txtidpengaduan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttulistanggapan = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtidpetugas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btntanggapi = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_pengaduan = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        txtstatus.setText("jTextField1");

        txtisilaporan.setColumns(20);
        txtisilaporan.setRows(5);
        jScrollPane3.setViewportView(txtisilaporan);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("| Tulis Tanggapan |");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        txtidtanggapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtanggapanActionPerformed(evt);
            }
        });
        jPanel1.add(txtidtanggapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, -1));
        jPanel1.add(txttgltanggapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 170, -1));

        txtidpengaduan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpengaduanActionPerformed(evt);
            }
        });
        jPanel1.add(txtidpengaduan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 150, -1));

        jLabel3.setText("ID Tanggapan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel4.setText("Tulis Tanggapan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel5.setText("ID Pengaduan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        txttulistanggapan.setColumns(20);
        txttulistanggapan.setRows(5);
        jScrollPane1.setViewportView(txttulistanggapan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, 130));

        jLabel6.setText("Tanggal");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        txtidpetugas.setForeground(new java.awt.Color(255, 0, 0));
        txtidpetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpetugasActionPerformed(evt);
            }
        });
        jPanel1.add(txtidpetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 150, -1));

        jLabel7.setText("ID Petugas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/iconfinder-social-media-4341269_120580.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 320, 300));

        btntanggapi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/clipboardNEW.png"))); // NOI18N
        btntanggapi.setText("Tanggapi");
        btntanggapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanggapiActionPerformed(evt);
            }
        });
        jPanel1.add(btntanggapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 110, 30));

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/blue.png"))); // NOI18N
        btnhapus.setText("Clear");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 90, 30));

        tabel_pengaduan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pengaduan", "Tanggal Pengaduan", "NIK", "Isi Laporan", "Foto", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_pengaduan.getTableHeader().setReorderingAllowed(false);
        tabel_pengaduan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pengaduanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_pengaduan);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 660, 140));

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
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 120, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cari Berdasarkan NIK");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 110, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/frame/Preview.png"))); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 525));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidtanggapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtanggapanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtanggapanActionPerformed

    private void txtidpengaduanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpengaduanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpengaduanActionPerformed

    private void txtidpetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpetugasActionPerformed

    private void btntanggapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntanggapiActionPerformed
        // TODO add your handling code here:
        simpandata();
        updatedata();
        baru();
    }//GEN-LAST:event_btntanggapiActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        baru();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tabel_pengaduanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pengaduanMouseClicked
        // TODO add your handling code here:
        setformtable();
    }//GEN-LAST:event_tabel_pengaduanMouseClicked

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tanggapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tanggapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tanggapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tanggapan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tanggapan dialog = new tanggapan(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btntanggapi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lblfoto;
    private javax.swing.JTable tabel_pengaduan;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtidpengaduan;
    public javax.swing.JTextField txtidpetugas;
    private javax.swing.JTextField txtidtanggapan;
    public javax.swing.JTextArea txtisilaporan;
    public javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtstatus;
    private com.toedter.calendar.JDateChooser txttglpengaduan;
    private com.toedter.calendar.JDateChooser txttgltanggapan;
    private javax.swing.JTextArea txttulistanggapan;
    // End of variables declaration//GEN-END:variables

private void simpandata() {
    String tampilan = "dd-MM-yyyy";
    SimpleDateFormat fm = new SimpleDateFormat(tampilan);
    String tgl = String.valueOf(fm.format(txttgltanggapan.getDate()));
    
        idtanggapan = txtidtanggapan.getText(); 
        idpengaduan = txtidpengaduan.getText();
        tgltanggapan = tgl.toString();
        tanggapan = txttulistanggapan.getText();
        idpetugas = txtidpetugas.getText();
        
        if (txtidtanggapan.getText().isEmpty() ||
            txtidpengaduan.getText().isEmpty() ||
            tgl.toString().isEmpty() || 
            txttulistanggapan.getText().isEmpty() || 
            txtidpetugas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,"Silahkan isi data terlebih dahulu !","Informasi",JOptionPane.INFORMATION_MESSAGE);
        } else {
            t.simpandata(idtanggapan, idpengaduan, tgltanggapan, tanggapan, idpetugas);
            JOptionPane.showMessageDialog(rootPane,"Data berhasil disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
             tampildata();
            
        }
        
 }
private void updatedata() {
        String data = "Selesai";
        idpengaduan = txtidpengaduan.getText();
        status = txtstatus.getText();
        status = data;
           v.updatedata(idpengaduan, status);
            tampildata();
        }
    
private void tampildata () {
    DefaultTableModel dtm = (DefaultTableModel) tabel_pengaduan.getModel();
    dtm.setRowCount(0);
    p.tampildata(dtm);
    tabel_pengaduan.setModel(dtm);
 }
private void cari(){
   String cari = txtcari.getText();
   DefaultTableModel dtm = (DefaultTableModel) tabel_pengaduan.getModel();
   dtm.setRowCount(0);
   ResultSet rs = p.caridata(dtm, cari);
   tabel_pengaduan.setModel(dtm);
 }
private void setformtable() {
     int baris = tabel_pengaduan.getSelectedRow();
        String satu =(String)tabel_pengaduan.getValueAt(baris,0);
        String dua =(String)tabel_pengaduan.getValueAt(baris,1);
        String tiga =(String)tabel_pengaduan.getValueAt(baris,2);
        String empat =(String)tabel_pengaduan.getValueAt(baris,3);
        String lima =(String)tabel_pengaduan.getValueAt(baris,4);
        String enam =(String)tabel_pengaduan.getValueAt(baris,5);
        

         SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date dateValue = null;
        try{
            dateValue = date.parse((String)tabel_pengaduan.getValueAt(baris, 1));
        } catch (ParseException ex){
            Logger.getLogger(tanggapan.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtidpengaduan.setText(satu);
        txttglpengaduan.setDate(dateValue);
        txtnik.setText(tiga);
        txtisilaporan.setText(empat);
        lblfoto.setText(lima);
        txtstatus.setText(enam);
        
  }
private void baru() {
   txtidtanggapan.setText(null);
   txttgltanggapan.setDate(null);
   txttulistanggapan.setText(null);
}
}

