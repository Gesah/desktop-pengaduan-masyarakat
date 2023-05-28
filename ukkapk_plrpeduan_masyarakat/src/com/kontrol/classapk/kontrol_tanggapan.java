/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kontrol.classapk;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class kontrol_tanggapan extends koneksi {
    public kontrol_tanggapan() {
        setkonek();
    }
    public void simpandata (String idtanggapan, String idpengaduan, String tgltanggapan, String tanggapan, String idpetugas){
        String sql = "INSERT INTO tb_tanggapan VALUES('"+idtanggapan+"','"+idpengaduan+"','"+tgltanggapan+"','"+tanggapan+"','"+idpetugas+"')";
        try{
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_tanggapan.class.getName()).log(Level.SEVERE, null, ex);
            
        }
 }
 public void tampildata (DefaultTableModel dtm){
        String sql = "SELECT * FROM tb_tanggapan";
        try {
            rs = st.executeQuery(sql);
            Object [] data = new Object [5];
            while (rs.next()){
               data[0] = rs.getString("id_tanggapan");
               data[1] = rs.getString("id_pengaduan");
               data[2] = rs.getString("tgl_tanggapan");
               data[3] = rs.getString("tanggapan");
               data[4] = rs.getString("id_petugas");
             dtm.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(kontrol_tanggapan.class.getName()).log(Level.SEVERE, null, ex);
    }   
  }
    public void updatedata (String idtanggapan, String idpengaduan, String tgltanggapan, String tanggapan, String idpetugas){
        String sql = "UPDATE tb_tanggapan SET id_pengaduan = '"+idpengaduan+"', tgl_tanggapan = '"+tgltanggapan+"', tanggapan = '"+tanggapan+"', id_petugas = '"+idpetugas+"' WHERE id_tanggapan = '"+idtanggapan+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_tanggapan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ResultSet caridata(DefaultTableModel dtm, String cari) {
        try {
            String sql = "SELECT * FROM tb_tanggapan WHERE id_tanggapan LIKE '%"+cari+"%'";
            rs = st.executeQuery(sql);
            Object [] data = new Object[5];
                while(rs.next()) {
              data[0] = rs.getString("id_tanggapan");
               data[1] = rs.getString("id_pengaduan");
               data[2] = rs.getString("tgl_tanggapan");
               data[3] = rs.getString("tanggapan");
               data[4] = rs.getString("id_petugas");
                dtm.addRow(data);
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_tanggapan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
      }
    public void hapusdata(String idtanggapan) {
        String sql = "DELETE FROM tb_tanggapan WHERE id_tanggapan = '"+idtanggapan+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_tanggapan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

