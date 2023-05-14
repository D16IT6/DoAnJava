/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Acount;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

public class AccountInDB {
    
    private static String Accountname="";
    Connection conn;

    public AccountInDB() {
        conn = ConnectSql.Connect.connectionDatabase();
    }

    public static String getAccountname() {
        return Accountname;
    }
    public boolean loginUsingHash(String username,String password)
    {
        try {
            String sql = "SELECT MATKHAU FROM dbo.TAIKHOAN WHERE TENTAIKHOAN = ?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, username);
            ResultSet rs = pre.executeQuery();
            rs.next();
            String hashInDB = rs.getString(1);
            return BCrypt.checkpw(password, hashInDB);
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean CheckLogin(String accountname, String password,int check) {
        
        try {
             String sql="";
            if(check==1)
            {
                sql = "SELECT COUNT(*) FROM TAIKHOAN WHERE TENTAIKHOAN=? AND MATKHAU=?";
            }
            else if(check==2)
            {
                sql ="SELECT COUNT(*) FROM SINHVIEN WHERE MASV=? AND MATKHAU=?";
                
            }
            PreparedStatement str = conn.prepareStatement(sql);
            str.setString(1, accountname);
            str.setString(2, password);
            ResultSet rs = str.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    Accountname=accountname;
                    System.out.println(Accountname);
                    return true;
                }
            }
        } catch (SQLException ex) {
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
        return false;
    }
}
