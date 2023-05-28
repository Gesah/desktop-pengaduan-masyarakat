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
public class kontrol_masyarakat extends koneksi{
    public kontrol_masyarakat(){
    setkonek();
 }
     public void simpandata (String nik, String namamasyarakat, String username, String password, String telp){
        String sql = "INSERT INTO tb_masyarakat VALUES ('"+nik+"','"+namamasyarakat+"','"+username+"','"+password+"','"+telp+"')";
        try{
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_masyarakat.class.getName()).log(Level.SEVERE, null, ex);
            
        }
 }
 public void tampildata (DefaultTableModel dtm){
        String sql = "SELECT * FROM tb_masyarakat";
        try {
            rs = st.executeQuery(sql);
            Object [] data = new Object [5];
            while (rs.next()){
               data[0] = rs.getString("nik");
               data[1] = rs.getString("nama");
               data[2] = rs.getString("username");
               data[3] = rs.getString("password");
               data[4] = rs.getString("telp");
             dtm.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(kontrol_masyarakat.class.getName()).log(Level.SEVERE, null, ex);
    }   
  }
    public void updatedata (String nik, String namamasyarakat, String username, String password, String telp){
        String sql = "UPDATE tb_masyarakat SET nama = '"+namamasyarakat+"', username = '"+username+"', password = '"+password+"', telp = '"+telp+"' WHERE nik = '"+nik+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_masyarakat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void hapusdata(String nik) {
        String sql = "DELETE FROM tb_masyarakat WHERE nik = '"+nik+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_masyarakat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet caridata(DefaultTableModel dtm, String cari) {
        try {
            String sql = "SELECT * FROM tb_masyarakat WHERE nama LIKE '%"+cari+"%'";
            rs = st.executeQuery(sql);
            Object [] data = new Object[5];
                while(rs.next()) {
                 data[0] = rs.getString("nik");
               data[1] = rs.getString("nama");
               data[2] = rs.getString("username");
               data[3] = rs.getString("password");
               data[4] = rs.getString("telp");
                dtm.addRow(data);
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_masyarakat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
      }
public ResultSet setloginmasyarakat(String username, String password) throws SQLException {
          String sql = "SELECT * FROM tb_masyarakat WHERE username = '"+username+"' AND password = '"+password+"'";
          return rs = st.executeQuery(sql);
 }
}

