/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kontrol.classapk;
import java.io.File;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author HP
 */
public class kontrol_laporan extends koneksi {
    public kontrol_laporan() {
        setkonek();
    }
      public void cetaklaporan(String path) {
        File lokasi = new File(path);
        try {
            JasperDesign jd = JRXmlLoader.load(lokasi);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<String, Object>(), konek);
            JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
            Logger.getLogger(kontrol_laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      public void cetaklaporannik(String path, HashMap map) {
        File lokasi = new File(path);
        try {
            JasperDesign jd = JRXmlLoader.load(lokasi);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, konek);
            JasperViewer.viewReport(jp, false);
         
        } catch (JRException ex) {
            Logger.getLogger(kontrol_laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
}

