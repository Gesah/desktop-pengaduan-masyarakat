/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kontrol.classapk;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.frame.views.splashscreen;
import com.frame.views.pilihanmenu;

/**
 *
 * @author HP
 */
public class koneksi {
   Connection konek;
   Statement st;
   public ResultSet rs;
   
   public void setkonek(){
       try{
           
        Class.forName("com.mysql.jdbc.Driver");
        konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pelporpengaduan","root","");
        st = konek.createStatement();
        System.out.println("Koneksi Berhasil");
           
            
       }catch (ClassNotFoundException ex){
           Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"<error> : "+ex,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
             System.exit(0);
       }catch (SQLException ex) {
           Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"<error> : "+ex,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
             System.exit(0);
       }
}
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Fungsi codingan dibawah ini sebagai mengubah tampilan menjadi tampilan default dengan sesuai system windows.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(koneksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // Fungsi codingan di bawah ini sebagai memanggil class koneksi saat di jalankan suatu program tsb.
        koneksi k = new koneksi();
        // Fungsi codingan di bawah ini sebagai memanggil form pada splashscreen.
        splashscreen s = new splashscreen();
        // Fungsi codingan di bawah ini sebagai menampilkan informasi saat masuk aplikasi.
        JOptionPane.showMessageDialog(null,"Selamat Datang Di Aplikasi Pelaporan Pengaduan Masyarakat","Info Penting",JOptionPane.INFORMATION_MESSAGE);
        // Fungsi codingan di bawah ini memanggil objek pada splashscreen();. 
        s.setVisible(true);
        // Fungsi codingan di bawah ini sebagai memanggil form pilihanmenu atau di maksud menu hakakses.
        pilihanmenu l = new pilihanmenu();
        // Fungsi codingan di bawah ini memanggil objek pada class koneksi();.
        k.setkonek();
        // Fungsi codingan di bawah ini sebagai menjalankan field progress pada splashscreen yaitu seperti loading. 
         try{
       for (int i = 0; i<= 100; i++){
           Thread.sleep(95); 
        splashscreen.progress.setValue(i);
        
        if(i==100){
        // Fungsi codingan di bawah ini memanggil objek pada splashscreen();
        // yang di nyatakan false saat progress telah selesai maka akan otomatis menutup form splashscreen.
        s.setVisible(false);
        // Fungsi codingan di bawah ini memanggil objek pada pilihanmenu(); atau yang di maksud form hakakses.
        l.setVisible(true);
        }
     }
    }catch (Exception e){
    
     }
    }
}
        
        
    
    

