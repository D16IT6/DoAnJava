/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
public class Student extends Person{
    private String masv;
    private String Nganh;
    private String Lop;

    public Student() {
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public Student(String masv, String Nganh, String Lop, String hodem, String ten, String ngaysinh, String Khoa, String email) {
        super(hodem, ten, ngaysinh, Khoa, email);
        this.masv = masv;
        this.Nganh = Nganh;
        this.Lop = Lop;
    }

    public String getNganh() {
        return Nganh;
    }

    public String getLop() {
        return Lop;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
}

