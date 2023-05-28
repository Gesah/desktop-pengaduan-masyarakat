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
public class kontrol_detaildb extends koneksi {
    
  public kontrol_detaildb(){
      setkonek();
    }
  public void tampildata(DefaultTableModel dtm){
    String sql = "SELECT * FROM tb_masyarakat,tb_pengaduan,tb_tanggapan,tb_petugas WHERE tb_pengaduan.id_pengaduan=tb_tanggapan.id_pengaduan AND tb_masyarakat.nik=tb_pengaduan.nik AND tb_petugas.id_petugas=tb_tanggapan.id_petugas AND tb_pengaduan.id_pengaduan";
        try {
            rs=st.executeQuery(sql);
            Object[] data = new Object[10];
            while(rs.next()){
            data[0]=rs.getString("nik");
            data[1]=rs.getString("username");
            data[2]=rs.getString("id_pengaduan");
            data[3]=rs.getString("tgl_pengaduan");
            data[4]=rs.getString("tgl_tanggapan");
            data[5]=rs.getString("isi_laporan");
            data[6]=rs.getString("foto");
            data[7]=rs.getString("tanggapan");
            data[8]=rs.getString("id_petugas");
            data[9]=rs.getString("status");
            dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_detaildb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public ResultSet caridata(DefaultTableModel dtm, String cari) {
        try {
            String sql = "SELECT * FROM tb_masyarakat,tb_pengaduan,tb_tanggapan,tb_petugas WHERE tb_pengaduan.id_pengaduan=tb_tanggapan.id_pengaduan AND tb_masyarakat.nik=tb_pengaduan.nik AND tb_petugas.id_petugas=tb_tanggapan.id_petugas AND tb_pengaduan.id_pengaduan AND tb_masyarakat.nik LIKE '%"+cari+"%'";
            rs = st.executeQuery(sql);
            Object [] data = new Object[10];
                while(rs.next()) {
            data[0]=rs.getString("nik");
            data[1]=rs.getString("username");
            data[2]=rs.getString("id_pengaduan");
            data[3]=rs.getString("tgl_pengaduan");
            data[4]=rs.getString("tgl_tanggapan");
            data[5]=rs.getString("isi_laporan");
            data[6]=rs.getString("foto");
            data[7]=rs.getString("tanggapan");
            data[8]=rs.getString("id_petugas");
            data[9]=rs.getString("status");
                dtm.addRow(data);
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_petugas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
} 
      }
