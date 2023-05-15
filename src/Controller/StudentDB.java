/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Controller;

import Model.Student;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class StudentDB implements IDataDB<Student> {

    private List<Student> listStudent;
    private Connection conn;

    public StudentDB(List<Student> listStudent, Connection conn) {
        this.listStudent = listStudent;
        this.conn = conn;
    }

    public StudentDB() {
        listStudent = new ArrayList<>();
        conn = ConnectSql.Connect.connectionDatabase();
    }

    @Override
    public void add(Student sv) {
        try {
            String sql = "INSERT INTO SINHVIEN VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sv.getMasv());
            ps.setString(2, sv.getHodem());
            ps.setString(3, sv.getTen());
            ps.setString(4, sv.getNgaysinh());
            ps.setString(5, sv.getQuequan());
            ps.setString(6, sv.getEmail());
            ps.setString(7, sv.getMaLop());          
            ps.execute();
            JOptionPane.showMessageDialog(null, "Thêm thành công !!");           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Thêm thất bại " + ex);           
        }
    }

    @Override
    public List<Student> showAll() {
        try {
            String sql = "SELECT * FROM SINHVIEN";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student sv = new Student();
                sv.setMasv(rs.getString("MASV"));
                sv.setHodem(rs.getString("HODEM"));
                sv.setTen(rs.getString("TEN"));
                sv.setNgaysinh(rs.getString("NGAYSINH"));
                sv.setQuequan(rs.getString("QUEQUAN"));
                sv.setEmail(rs.getString("EMAIL"));
                sv.setMaLop(rs.getString("MALOP"));  
                listStudent.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStudent;
    }

    @Override
    public void delete(Student t) {
        try {
            int xd = JOptionPane.showConfirmDialog(null, "Xác nhận xóa thông tin : " + t);
            if (xd == 0) {
                String sql = "DELETE FROM SINHVIEN WHERE MASV=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, t.getMasv().replaceAll(" ", ""));//thay the khoang
                ps.execute();
                JOptionPane.showMessageDialog(null, "Xóa thành công !!!!!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại " + ex);
        }
    }

    @Override
    public void set(Student t) {
        try {
            String sql ="UPDATE SINHVIEN SET HODEM=?,TEN=?,MALOP=? WHERE MASV=?";
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, t.getHodem());
            ps.setString(2, t.getTen());           
            ps.setString(3, t.getMaLop());
            ps.setString(4, t.getMasv().replaceAll(" ", ""));
            ps.execute();
            JOptionPane.showMessageDialog(null, "Sửa thành công !!!!!!"+t.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa thất bại !!!!!!"+e);
        }
    }

    @Override
    public List<Student> SearchByName(String x) {
        try {
            String[]arr=x.split(",");
            String sql="";
            if(arr[1].equals("1")){
                sql="SELECT * FROM SINHVIEN WHERE MALOP like CONCAT('%',?,'%')";
            }else if(arr[1].equals("2")){
                sql = "SELECT * FROM SINHVIEN WHERE MASV like CONCAT('%',?,'%')";
            }else{
                sql="SELECT * FROM SINHVIEN WHERE TEN like CONCAT('%',?,'%')";
            }
            PreparedStatement prs=conn.prepareStatement(sql);
            prs.setString(1,arr[0]);
            ResultSet rs=prs.executeQuery();
            while(rs.next()){
                Student sv = new Student();
                sv.setMasv(rs.getString("MASV"));
                sv.setHodem(rs.getString("HODEM"));
                sv.setTen(rs.getString("TEN"));
                sv.setNgaysinh(rs.getString("NGAYSINH"));
                sv.setQuequan(rs.getString("QUEQUAN"));
                sv.setEmail(rs.getString("EMAIL"));
                sv.setMaLop(rs.getString("MALOP"));  
                listStudent.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listStudent;
    }

    public List<String>ShowAllClass() {
        String sql ="SELECT MALOP  FROM LOP ";  
        List<String> arrClass=new ArrayList<>();
        try {          
            PreparedStatement ps =conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //arrClass.add(rs.getString("MALOP").replaceAll(" ", "")+":"+rs.getString("TenLop"));
                arrClass.add(rs.getString("MALOP"));
            }
        } catch (Exception e) {
        }
        return arrClass;
    }
    public static void main(String[] args) {
        List<Student> arr=new StudentDB().SearchByName("t,3");
        for(Student lop : arr )
        {
            System.out.println(lop);
        }
    }
}
