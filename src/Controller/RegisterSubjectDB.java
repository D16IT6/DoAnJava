/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author PC
 */
import Model.Subject; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegisterSubjectDB {

    private String IDStudent=new AccountInDB().getAccountname();
    Connection conn;

    public RegisterSubjectDB() {
        conn =ConnectSql.Connect.connectionDatabase();
    }

    public List<MyCombobox> showAllSJ() {
        String sql = "SELECT * FROM MONHOC";
        PreparedStatement prs;
        List<MyCombobox> arrSubject = new ArrayList<>();
        try {
            prs = conn.prepareStatement(sql);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                MyCombobox sj =new MyCombobox();
                sj.setValue(rs.getString("MAMH"));
                sj.setText(rs.getString("TENMH"));
                arrSubject.add(sj);
            }
            return arrSubject;
        } catch (SQLException ex) {

        }
        return arrSubject;
    }  
    public List<ctLopHP> showAllLOPHPCDK(String mamh) {
        String sql = "EXEC CHUADANGKY ?,?";    
        PreparedStatement prs;
        List<ctLopHP> arrLopHP = new ArrayList<>();
        
        try {
            prs = conn.prepareStatement(sql);
            prs.setString(1, IDStudent);
            prs.setString(2, mamh);
            ResultSet rs = prs.executeQuery();         
                while (rs.next()) {
                ctLopHP lp =new ctLopHP(); 
                lp.setMaLopHP(rs.getString("MALOPHP"));
                lp.setTenLopHP(rs.getString("TENLOP"));   
                lp.setTenMH(rs.getString("TENMH"));                                        
                lp.setTenGV(rs.getString("HOVATENGIANGVIEN"));
                lp.setSoTiet(rs.getInt("SOTIET"));
                lp.setSoLuongSV(rs.getInt("SOLUONGSV"));               
                arrLopHP.add(lp);
            }                
        } catch (SQLException ex) {
        }
        return arrLopHP;
    }
    public List<ctLopHP> showAllLOPHPDDK() {
        String sql = "EXEC DADANGKY ?";       
        PreparedStatement prs;
        List<ctLopHP> arrLopHP = new ArrayList<>();   
        try {
            prs = conn.prepareStatement(sql);
            prs.setString(1, IDStudent);
            ResultSet rs = prs.executeQuery();         
                while (rs.next()) {
                ctLopHP lp =new ctLopHP(); 
                lp.setMaLopHP(rs.getString("MALOPHP"));
                lp.setTenLopHP(rs.getString("TENLOP"));   
                lp.setTenMH(rs.getString("TENMH"));                                        
                lp.setTenGV(rs.getString("HOVATENGIANGVIEN"));
                lp.setSoTiet(rs.getInt("SOTIET"));
                lp.setSoLuongSV(rs.getInt("SOLUONGSV")); 
                arrLopHP.add(lp);
            }                
        } catch (SQLException ex) {
        }
        return arrLopHP;
    }
    public void DangKy(String malophp){
        String sql ="INSERT INTO ctLopHocPhanAndSinhVien VALUES(?,?)";
        try {
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, IDStudent);
            ps.setString(2,malophp);
            int res = ps.executeUpdate();
            if(res == 1){            
                JOptionPane.showMessageDialog(null,"Đăng Ký Thành Công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Lớp đã đầy","Thông báo", JOptionPane.INFORMATION_MESSAGE);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterSubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    public void HuyDangKy(String malophp){
        String sql ="DELETE FROM ctLopHocPhanAndSinhVien WHERE MASV=? AND MALOPHP=?";
        try {
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, IDStudent);
            ps.setString(2,malophp);
            int res =ps.executeUpdate();
            if(res==1){
                JOptionPane.showMessageDialog(null,"Hủy Đăng Ký Thành Công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }         
        } catch (SQLException ex) {
            Logger.getLogger(RegisterSubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    public Student showAllSV() {
        Student sv = new Student();
        try {
            String sql = "SELECT * FROM SINHVIEN WHERE MASV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, IDStudent);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                sv.setMasv(rs.getString("MASV"));
                sv.setHodem(rs.getString("HODEM"));
                sv.setTen(rs.getString("TEN"));
                sv.setNgaysinh(rs.getString("NGAYSINH"));
                sv.setQuequan(rs.getString("QUEQUAN"));
                sv.setEmail(rs.getString("EMAIL"));
                sv.setMaLop(rs.getString("MALOP"));     
            }
                          
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }
//    public static void main(String[] args) {
//        List<LopHP> arra=new RegisterSubjectDB().showAllLOPHP();
//        for(LopHP a:arra){
//            System.out.println(a.getMaLopHP());
//        }
//    }
}
