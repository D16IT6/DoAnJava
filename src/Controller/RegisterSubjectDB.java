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

public class RegisterSubjectDB {

    Connection conn;

    public RegisterSubjectDB() {
        conn =ConnectSql.Connect.connectionDatabase();
    }

    public List<String> showAll() {
        String sql = "SELECT TENMH FROM MONHOC";
        PreparedStatement prs;
        List<String> arrSubject = new ArrayList<>();
        try {
            prs = conn.prepareStatement(sql);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                arrSubject.add(rs.getString("TENMH"));
            }
            return arrSubject;
        } catch (SQLException ex) {

        }
        return arrSubject;
    }
//    public static void main(String[] args) {
//        List<String> arr=new RegisterSubjectDB().showAll();
//        for(String a:arr){
//            System.out.println(a);
//        }
//    }
}
