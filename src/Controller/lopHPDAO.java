/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.LopHP;
import Model.MyCombobox;
import Model.Student;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class lopHPDAO {

    private List arrLop;
    private Connection conn;

    public lopHPDAO() {
        this.arrLop = new ArrayList();
        this.conn = ConnectSql.Connect.connectionDatabase();
    }

    public void add(LopHP lp) {
        try {
            //Connection conn = ConnectSql.Connect.connectionDatabase();
            String sqlAdd = "INSERT INTO LOPHOCPHAN VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(sqlAdd);
            pr.setString(1, lp.getMaLopHP().toUpperCase());
            pr.setString(2, lp.getTenLop());
            pr.setString(3, lp.getNgayBD());
            pr.setString(4, lp.getNgayKT());
            pr.setString(5, lp.getSoLuongSV() + "");
            pr.setString(6, lp.getMaGV());
            pr.setString(7, lp.getMaMH());
            int res = pr.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công !!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại " + e);
        }
    }

    public List<LopHP> findALL() {

        String sql = "SELECT * FROM LOPHOCPHAN";
        PreparedStatement prs;
        try {
            prs = conn.prepareStatement(sql);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                LopHP lp = new LopHP();
                lp.setMaLopHP(rs.getString("MALOPHP").replaceAll(" ", ""));
                lp.setTenLop(rs.getString("TENLOP"));
                lp.setNgayBD(rs.getString("NGAYBD"));
                lp.setNgayKT(rs.getString("NGAYKT"));
                lp.setSoLuongSV(rs.getInt("SOLUONGSV"));
                lp.setMaGV(rs.getString("MAGV").replaceAll(" ", ""));
                lp.setMaMH(rs.getString("MAMH").replaceAll("", ""));
                arrLop.add(lp);
            }
        } catch (Exception e) {
        }
        return arrLop;

    }

    public void Delete(LopHP lp) {
        try {
            //Connection conn=ConnectSql.Connect.connectionDatabase();
            String xoa = "DELETE FROM LOPHOCPHAN WHERE MALOPHP=?";
            PreparedStatement prs = conn.prepareStatement(xoa);
            prs.setString(1, lp.getMaLopHP());
            int res = prs.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Xóa thành công !!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lớp đã có học sinh đăng ký!!!");
        }
    }

    public void Update(LopHP lp) {
        try {
            //Connection conn =ConnectSql.Connect.connectionDatabase();
            String sua = "UPDATE LOPHOCPHAN SET TENLOP=?,NGAYBD=?,NGAYKT=?,SOLUONGSV=?,MAGV=?,MAMH=? WHERE MALOPHP=?";
            PreparedStatement prs = this.conn.prepareStatement(sua);
            prs.setString(1, lp.getTenLop());
            prs.setString(2, lp.getNgayBD());
            prs.setString(3, lp.getNgayKT());
            prs.setString(4, lp.getSoLuongSV() + "");
            prs.setString(5, lp.getMaGV());
            prs.setString(6, lp.getMaMH());
            prs.setString(7, lp.getMaLopHP());
            int res = prs.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Sửa thành công !!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Sửa không thành công !!" + e);
        }
    }

    public List<LopHP> Search(String searchContent, int check) {
        try {
            Connection conn = ConnectSql.Connect.connectionDatabase();
            String checkSearch;
            switch (check) {
                case 0:
                    checkSearch = "MALOPHP";
                    break;
                case 1:
                    checkSearch = "MAGV";
                    break;
                case 2:
                    checkSearch = "MAMH";
                    break;
                default:
                    throw new AssertionError();
            }
            String timKiem = "SELECT * FROM LOPHOCPHAN WHERE " + checkSearch + " =?";
            PreparedStatement prs = conn.prepareStatement(timKiem);
            //prs.setString(1, checkSearch);
            prs.setString(1, searchContent);
            ResultSet rs = prs.executeQuery();
            System.out.println(timKiem);
            while (rs.next()) {
                LopHP lp = new LopHP();
                lp.setMaLopHP(rs.getString("MALOPHP"));
                lp.setTenLop(rs.getString("TENLOP"));
                lp.setNgayBD(rs.getString("NGAYBD"));
                lp.setNgayKT(rs.getString("NGAYKT"));
                lp.setSoLuongSV(rs.getInt("SOLUONGSV"));
                lp.setMaGV(rs.getString("MAGV"));
                lp.setMaMH(rs.getString("MAMH"));
                arrLop.add(lp);
            }
        } catch (Exception e) {
        }
        return arrLop;
    }

    public List<MyCombobox> ShowGV() {
        List<MyCombobox> arrGV = new ArrayList<>();
        String sql = "SELECT MAGV,CONCAT(HODEM,' ',TEN) AS HOVATEN FROM GiangVien";
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                MyCombobox gv = new MyCombobox();
                gv.setText(rs.getString("HOVATEN"));
                gv.setValue(rs.getString("MAGV"));
                arrGV.add(gv);
            }
        } catch (Exception e) {
        }
        return arrGV;
    }

    public List<MyCombobox> ShowSJ() {
        List<MyCombobox> arrSubject = new ArrayList<>();
        String sql = "SELECT * FROM MONHOC";
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                MyCombobox mh = new MyCombobox();
                mh.setValue(rs.getString("MAMH"));
                mh.setText(rs.getString("TENMH"));
                arrSubject.add(mh);
            }
        } catch (Exception e) {
        }
        return arrSubject;
    }

    public String layTenGV(String maGV) throws SQLException {
        String sql = "SELECT CONCAT(HODEM,' ',TEN) AS HOVATEN FROM GiangVien WHERE MAGV=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, maGV);
        ResultSet rs = ps.executeQuery();
        try {
            if (rs.next()) {
                return rs.getString("HOVATEN");
            }
        } catch (Exception e) {

        }
        return "";
    }

    public String layTenMH(String maMH) throws SQLException {
        String sql = "SELECT * FROM MONHOC WHERE MAMH=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, maMH);
        ResultSet rs = ps.executeQuery();
        try {
            if (rs.next()) {
                return rs.getString("TENMH");
            }
        } catch (Exception e) {
        }
        return "";
    }

    public MyCombobox layMaGV(String hodemGV, String tenGV) {
        
        String sql = "SELECT MAGV  FROM GiangVien WHERE HODEM=? AND TEN=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hodemGV);
            ps.setString(2, tenGV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MyCombobox gv = new MyCombobox();
                gv.setValue(rs.getString("MAGV"));
                gv.setText(hodemGV + " " + tenGV);
                return gv;
            }
        } catch (Exception e) {

        }
        return null;
    }
    public MyCombobox layMaMH(String tenMH) {  
        String sql = "SELECT * FROM MONHOC WHERE TENMH=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tenMH);          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MyCombobox mh = new MyCombobox();
                mh.setValue(rs.getString("MAMH"));
                mh.setText(rs.getString("TENMH"));
                return mh;
            }
        } catch (Exception e) {

        }
        return null;
    }
//    public static void main(String[] args) {
//        lopHPDAO ld=new lopHPDAO();            
//        System.out.println(ld.Search("LOPHP01", " "));
//    }
}
