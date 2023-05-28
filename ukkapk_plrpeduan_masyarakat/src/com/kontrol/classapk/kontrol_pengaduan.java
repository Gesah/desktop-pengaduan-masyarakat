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
public class kontrol_pengaduan extends koneksi {
    public kontrol_pengaduan() {
    setkonek();
    
 }
 public void simpandata (String idpengaduan, String tglpengaduan, String nik, String isilaporan, String foto, String status){
        String sql = "INSERT INTO tb_pengaduan VALUES('"+idpengaduan+"','"+tglpengaduan+"','"+nik+"','"+isilaporan+"','"+foto+"','"+status+"')";
        try{
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_pengaduan.class.getName()).log(Level.SEVERE, null, ex);
            
        }
 }
 public void tampildata (DefaultTableModel dtm){
        String sql = "SELECT * FROM tb_pengaduan";
        try {
            rs = st.executeQuery(sql);
            Object [] data = new Object [6];
            while (rs.next()){
               data[0] = rs.getString("id_pengaduan");
               data[1] = rs.getString("tgl_pengaduan");
               data[2] = rs.getString("nik");
               data[3] = rs.getString("isi_laporan");
               data[4] = rs.getString("foto");
               data[5] = rs.getString("status");
             dtm.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(kontrol_pengaduan.class.getName()).log(Level.SEVERE, null, ex);
    }   
  }
    public void updatedata (String idpengaduan, String tglpengaduan, String nik, String isilaporan, String foto, String status){
        String sql = "UPDATE tb_pengaduan SET tgl_pengaduan = '"+tglpengaduan+"', nik = '"+nik+"', isi_laporan = '"+isilaporan+"', foto = '"+foto+"', status = '"+status+"' WHERE id_pengaduan = '"+idpengaduan+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_pengaduan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public ResultSet caridata(DefaultTableModel dtm, String cari) {
        try {
            String sql = "SELECT * FROM tb_pengaduan WHERE id_pengaduan LIKE '%"+cari+"%'";
            rs = st.executeQuery(sql);
            Object [] data = new Object[6];
                while(rs.next()) {
               data[0] = rs.getString("id_pengaduan");
               data[1] = rs.getString("tgl_pengaduan");
               data[2] = rs.getString("nik");
               data[3] = rs.getString("isi_laporan");
               data[4] = rs.getString("foto");
               data[5] = rs.getString("status");
                dtm.addRow(data);
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_pengaduan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
      }
    public void hapusdata(String idpengaduan) {
        String sql = "DELETE FROM tb_pengaduan WHERE id_pengaduan = '"+idpengaduan+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_pengaduan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}