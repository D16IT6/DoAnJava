/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import Model.*;
import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuanLyDangKyDB {
    private Connection conn;

    public QuanLyDangKyDB() {
        this.conn = ConnectSql.Connect.connectionDatabase();
    }
    public List<ctLopHP> showAllLopHP() {
        List<ctLopHP> arrLop =new ArrayList<>();
        String sql = "EXEC showlop";
        PreparedStatement prs;
        try {
            prs = conn.prepareStatement(sql);           
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                ctLopHP lp = new ctLopHP();
                lp.setMaLopHP(rs.getString("MALOPHP").replaceAll(" ", ""));
                lp.setTenLopHP(rs.getString("TENLOP"));                
                lp.setMaSV(rs.getString("MASV"));
                lp.setTenSV(rs.getString("TENSINHVIEN"));
                lp.setMaMH(rs.getString("MAMH"));
                lp.setTenMH(rs.getString("TENMH"));
                lp.setMaGV(rs.getString("MAGV"));
                lp.setTenGV(rs.getString("TenGiangVien"));
                arrLop.add(lp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arrLop;
    }
//    public static void main(String[] args) {
//        List<ctLopHP> arra=new QuanLyDangKyDB().showAllLopHP();
//        for(ctLopHP a:arra){
//            System.out.println(a.getMaLopHP());
//        }
//    }
}
