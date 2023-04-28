/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
public class Student extends Person{
    private String masv;
    private String Lop;

    public Student() {
    }
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getLop() {
        return Lop;
    }

    public Student(String masv, String Lop, String hodem, String ten, String ngaysinh, String Khoa, String email, String quequan) {
        super(hodem, ten, ngaysinh, Khoa, email, quequan);
        this.masv = masv;
        this.Lop = Lop;
    }
    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
}

