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
            PreparedStatement prs = conn.prepareStatement(sql);
            prs.setString(1, sub.getMamh());
            prs.setString(2, sub.getTenmh());
            prs.setString(3, sub.getSotiet() + "");
            prs.setString(4, sub.getLoaimh());
            int res = prs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void set(Subject t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void showByName(String x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Subject> SortByNumOfLessASC() {
        arrSubject = new SubjectDB().showAll();
        Collections.sort(arrSubject, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getSotiet() - o2.getSotiet();
            }

        });

        return arrSubject;
    }

    public List<Subject> SortByNumOfLessDESC() {
        arrSubject = new SubjectDB().showAll();
        Collections.sort(arrSubject, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return -o1.getSotiet() + o2.getSotiet();
            }

        });

        return arrSubject;
    }

    public List<Subject> SearchByName(String name) {
        try {
<<<<<<< HEAD:src/DAO/SubjectDB.java
            String sql = "SELECT * FROM MONHOC WHERE TENMH LIKE'%?%'";
=======
            String sql = "SELECT * FROM MONHOC WHERE TENMH like concat('%',?,'%')";
>>>>>>> 2c294b5321a8ea108cc2f48d4197500bb82eb081:src/Controller/SubjectDB.java
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
