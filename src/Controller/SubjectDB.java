/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Subject;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Controller.Sort.*;

public class SubjectDB implements IDataDB<Subject> {

    private List arrSubject;
    private Connection conn;

    public SubjectDB() {
        arrSubject = new ArrayList();
        conn = ConnectSql.Connect.connectionDatabase();
    }

    @Override
    public void add(Subject sub) {
        try {
            Connection conn = ConnectSql.Connect.connectionDatabase();
            String sql = "INSERT INTO MONHOC VALUES (?,?,?,?)";
            PreparedStatement prs = conn.prepareStatement(sql);
            prs.setString(1, sub.getMamh());
            prs.setString(2, sub.getTenmh());
            prs.setString(3, sub.getSotiet() + "");
            prs.setString(4, sub.getLoaimh());
            int rs = prs.executeUpdate();
            JOptionPane.showMessageDialog(null,"Thêm thành công !!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Thêm thất bại : "+ex);
        }
    }

    @Override
    public List<Subject> showAll() {
        String sql = "SELECT * FROM MONHOC";
        PreparedStatement prs;
        try {
            prs = conn.prepareStatement(sql);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Subject sj = new Subject();
                sj.setMamh(rs.getString("MAMH"));
                sj.setTenmh(rs.getString("TENMH"));
                sj.setSotiet(rs.getInt("SOTIET"));
                sj.setLoaimh(rs.getString("LOAIMH"));
                arrSubject.add(sj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arrSubject;
    }

    @Override
    public void delete(Subject sub) {
        try {
            String sql = "DELETE FROM MONHOC WHERE MAMH=? AND TENMH=? AND SOTIET=? AND LOAIMH=?";
            int check=JOptionPane.showConfirmDialog(null,"bạn có muốn xóa "+sub);
            if(check==1){
                return;
            }
            PreparedStatement prs = conn.prepareStatement(sql);
            prs.setString(1, sub.getMamh());
            prs.setString(2, sub.getTenmh());
            prs.setString(3, sub.getSotiet() + "");
            prs.setString(4, sub.getLoaimh());
            int res = prs.executeUpdate();
            if(res==1){
                JOptionPane.showMessageDialog(null,"Xóa thành công" +sub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void set(Subject sub) {
        try {
            String sql = "UPDATE MONHOC SET TENMH=? ,SOTIET=?, LOAIMH=? WHERE MAMH=? ";
            PreparedStatement prs = conn.prepareStatement(sql);
            prs.setString(4, sub.getMamh());
            prs.setString(1, sub.getTenmh());
            prs.setString(2, sub.getSotiet() + "");
            prs.setString(3, sub.getLoaimh());
            int res = prs.executeUpdate();
            if(res==1){
                JOptionPane.showMessageDialog(null,"Sửa thành công" +sub);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Subject> SortByNumOfLessASC() {
        arrSubject = new SubjectDB().showAll();
        
        return new SortByNumless().sortAsc(arrSubject);
    }

    public List<Subject> SortByNumOfLessDESC() {
        arrSubject = new SubjectDB().showAll();
        return new SortByNumless().sortDesc(arrSubject);
    }
    @Override
    public List<Subject> SearchByName(String name) {
        try {
            String sql = "SELECT * FROM MONHOC WHERE TENMH like concat('%',?,'%')";
            PreparedStatement prs = conn.prepareStatement(sql);
            prs.setString(1, name);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Subject sj = new Subject();
                sj.setMamh(rs.getString("MAMH"));
                sj.setTenmh(rs.getString("TENMH"));
                sj.setSotiet(rs.getInt("SOTIET"));
                sj.setLoaimh(rs.getString("LOAIMH"));
                arrSubject.add(sj);
            }
        } catch (SQLException ex) {
        }
        return arrSubject;
    }

    public List<Subject> SearchByNumLess(String min, String max) {
        try {
            String sql = "SELECT * FROM MONHOC WHERE SOTIET>=? AND SOTIET <=?";
            PreparedStatement prs = conn.prepareStatement(sql);
            prs.setString(1, min);
            prs.setString(2, max);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Subject sj = new Subject();
                sj.setMamh(rs.getString("MAMH"));
                sj.setTenmh(rs.getString("TENMH"));
                sj.setSotiet(rs.getInt("SOTIET"));
                sj.setLoaimh(rs.getString("LOAIMH"));
                arrSubject.add(sj);
            }
            return arrSubject;
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrSubject;
    }
//    public static void main(String[] args) {
//        List<Subject> list=new SubjectDB().SearchByNumLess("50","75");
//        for(Subject sub:list){
//            System.out.println(sub);
//        }
//    }
}
