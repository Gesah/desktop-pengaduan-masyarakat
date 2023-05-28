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
public class kontrol_petugas extends koneksi {
     public kontrol_petugas(){
    setkonek();
 }
      public void simpandata (String idpetugas, String namapetugas, String username, String password, String telp, String level){
        String sql = "INSERT INTO tb_petugas VALUES ('"+idpetugas+"','"+namapetugas+"','"+username+"','"+password+"','"+telp+"','"+level+"')";
        try{
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_petugas.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
}
 public void tampildata (DefaultTableModel dtm){
        String sql = "SELECT * FROM tb_petugas";
        try {
            rs = st.executeQuery(sql);
            Object [] data = new Object [6];
            while (rs.next()){
               data[0] = rs.getString("id_petugas");
               data[1] = rs.getString("nama_petugas");
               data[2] = rs.getString("username");
               data[3] = rs.getString("password");
               data[4] = rs.getString("telp");
               data[5] = rs.getString("level");
             dtm.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(kontrol_petugas.class.getName()).log(Level.SEVERE, null, ex);
       
    }   
  }
    public ResultSet caridata(DefaultTableModel dtm, String cari) {
        try {
            String sql = "SELECT * FROM tb_petugas WHERE username LIKE '%"+cari+"%'";
            rs = st.executeQuery(sql);
            Object [] data = new Object[6];
                while(rs.next()) {
               data[0] = rs.getString("id_petugas");
               data[1] = rs.getString("nama_petugas");
               data[2] = rs.getString("username");
               data[3] = rs.getString("password");
               data[4] = rs.getString("telp");
               data[5] = rs.getString("level");
                dtm.addRow(data);
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_petugas.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        return rs;
        
      }
    public void updatedata (String idpetugas, String namapetugas, String username, String password, String telp, String level){
        String sql = "UPDATE tb_petugas SET nama_petugas = '"+namapetugas+"', username = '"+username+"', password = '"+password+"', telp = '"+telp+"', level = '"+level+"' WHERE id_petugas = '"+idpetugas+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_petugas.class.getName()).log(Level.SEVERE, null, ex);
          
        }
    }
    public void hapusdata(String idpetugas) {
        String sql = "DELETE FROM tb_petugas WHERE id_petugas = '"+idpetugas+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_petugas.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
      public ResultSet caridivision (String cari) throws SQLException {
          String sql = "SELECT * FROM tb_petugas WHERE level = '"+cari+"'";
          return rs = st.executeQuery(sql);
           
        }
      


      public ResultSet setlogin(String username, String password, String level) throws SQLException {
          String sql = "SELECT * FROM tb_petugas WHERE username = '"+username+"' AND password = '"+password+"' AND level ='"+level+"'";
          return rs = st.executeQuery(sql);
     }
  }      
 