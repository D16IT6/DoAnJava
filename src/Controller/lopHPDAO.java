/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.LopHP;
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
public class lopHPDAO {
    private List arrLop;
    private Connection conn;

    public lopHPDAO() {
        this.arrLop = new ArrayList();
        this.conn = ConnectSql.Connect.connectionDatabase();
    }
    public void add(LopHP lp) {
        try {
            Connection conn = ConnectSql.Connect.connectionDatabase();
            String sqlAdd = "INSERT INTO LOPHOCPHAN VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(sqlAdd);
            pr.setString(1, lp.getMaLopHP().toUpperCase());
            pr.setString(2, lp.getTenLop());                     
            pr.setString(3, lp.getNgayBD());
            pr.setString(4, lp.getNgayKT());
            pr.setString(5, lp.getSoLuongSV() + ""); 
            pr.setString(6, lp.getMaGV());
            pr.setString(7, lp.getMaMH());
            pr.execute();
        } catch (Exception e) {
        }
    }
    public List<LopHP> findALL() {
        
        String sql = "SELECT * FROM LOPHOCPHAN";
        PreparedStatement prs;
        try {
            prs = conn.prepareStatement(sql);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                LopHP lp =new LopHP();
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
    public void Delete(LopHP lp){
        try {
            Connection conn=ConnectSql.Connect.connectionDatabase();
            String xoa="DELETE FROM LOPHOCPHAN WHERE MALOPHP=?";
            PreparedStatement prs= conn.prepareStatement(xoa);
            prs.setString(1, lp.getMaLopHP());
            prs.execute();
        } catch (Exception e) {
        }            
    }
    public void Update(LopHP lp){
        try {
            Connection conn =ConnectSql.Connect.connectionDatabase();
            String sua="UPDATE LOPHOCPHAN SET TENLOP=?,NGAYBD=?,NGAYKT=?,SOLUONGSV=?,MAGV=?,MAMH=? WHERE MALOPHP=?";
            PreparedStatement prs=this.conn.prepareStatement(sua);
            prs.setString(1, lp.getTenLop());                                
            prs.setString(2, lp.getNgayBD());
            prs.setString(3, lp.getNgayKT());
            prs.setString(4, lp.getSoLuongSV()+"");
            prs.setString(5, lp.getMaGV());
            prs.setString(6, lp.getMaMH());
            prs.setString(7, lp.getMaLopHP());  
            prs.execute();
        } catch (Exception e) {
        }
    }
    public List<LopHP> Search(String searchContent,int check){
        try {
            Connection conn=ConnectSql.Connect.connectionDatabase();
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
            String timKiem="SELECT * FROM LOPHOCPHAN WHERE "+checkSearch+" =?";           
            PreparedStatement prs =conn.prepareStatement(timKiem);
            //prs.setString(1, checkSearch);
            prs.setString(1,searchContent);         
            ResultSet rs = prs.executeQuery();
            System.out.println(timKiem);
            while (rs.next()) {
                LopHP lp =new LopHP();
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
    
//    public static void main(String[] args) {
//        lopHPDAO ld=new lopHPDAO();            
//        System.out.println(ld.Search("LOPHP01", " "));
//    }
}
