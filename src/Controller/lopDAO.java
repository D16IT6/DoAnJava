/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Lop;
import Model.Student;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class lopDAO {
    private List arrLop;
    private Connection conn;

    public lopDAO() {
        this.arrLop = new ArrayList();
        this.conn = ConnectSql.Connect.connectionDatabase();
    }
    public void add(Lop lp) {
        try {
            Connection conn = ConnectSql.Connect.connectionDatabase();
            String sqlAdd = "INSERT INTO LOP VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(sqlAdd);
            pr.setString(1, lp.getMaLop().toUpperCase());
            pr.setString(2, lp.getTenLop());
            pr.setString(3, lp.getMaNganh());
            pr.setString(4, lp.getMaGV());
            pr.setString(5, lp.getSoLuongSV() + "");
            pr.setString(6, lp.getNgayBD());
            pr.setString(7, lp.getNgayKT());
            pr.execute();
        } catch (Exception e) {
        }
    }
    public List<Lop> findALL() {
        
        String sql = "SELECT * FROM LOP";
        PreparedStatement prs;
        try {
            prs = conn.prepareStatement(sql);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Lop lp =new Lop();
                lp.setMaLop(rs.getString("MALOP"));
                lp.setTenLop(rs.getString("TenLop"));
                lp.setMaNganh(rs.getString("MANGANH"));
                lp.setMaGV(rs.getString("MAGV"));
                lp.setSoLuongSV(rs.getInt("SOLUONGSV"));
                lp.setNgayBD(rs.getString("NGAYBD"));
                lp.setNgayKT(rs.getString("NGAYKT"));
                arrLop.add(lp);
            }
        } catch (Exception e) {
        } 
        return arrLop;
        
    }
    public void Delete(Lop lp){
        try {
            Connection conn=ConnectSql.Connect.connectionDatabase();
            String xoa="DELETE FROM LOP WHERE MAlOP=?";
            PreparedStatement prs= conn.prepareStatement(xoa);
            prs.setString(1, lp.getMaLop());
            prs.execute();
        } catch (Exception e) {
        }            
    }
    public void Update(Lop lp){
        try {
            Connection conn =ConnectSql.Connect.connectionDatabase();
            String sua="UPDATE LOP SET TenLop=?,MANGANH=?,MAGV=?,SOLUONGSV=?,NGAYBD=?,NGAYKT=? WHERE MALOP=?";
            PreparedStatement prs=this.conn.prepareStatement(sua);
            prs.setString(1, lp.getTenLop());
            prs.setString(2, lp.getMaNganh());
            prs.setString(3, lp.getMaGV());
            prs.setString(4, lp.getSoLuongSV()+"");
            prs.setString(5, lp.getNgayBD());
            prs.setString(6, lp.getNgayKT());
            prs.setString(7, lp.getMaLop());  
            prs.execute();
        } catch (Exception e) {
        }
    }
    public List<Lop> Search(String tenLop){
        try {
            Connection conn=ConnectSql.Connect.connectionDatabase();
            String timKiem="SELECT * FROM LOP WHERE TenLop LIKE ?";
            PreparedStatement prs =conn.prepareStatement(timKiem);
            //prs.setString(1, checkSearch);
            prs.setString(1, "%"+tenLop+"%");         
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Lop lp =new Lop();
                lp.setMaLop(rs.getString("MALOP"));
                lp.setTenLop(rs.getString("TenLop"));
                lp.setMaNganh(rs.getString("MANGANH"));
                lp.setMaGV(rs.getString("MAGV"));
                lp.setSoLuongSV(rs.getInt("SOLUONGSV"));
                lp.setNgayBD(rs.getString("NGAYBD"));
                lp.setNgayKT(rs.getString("NGAYKT"));
                arrLop.add(lp);
            }
            
        } catch (Exception e) {
        }   
        return arrLop;
    }
    
//    public static void main(String[] args) {
//        lopDAO ld=new lopDAO();
//        System.out.println(ld.findALL());
//        ld.add(new Lop( "L03","D16CNPM6","CNT","GV01",13,"2020/1/12","2020/6/12"));
//        System.out.println(ld.findALL());
//    }
}
