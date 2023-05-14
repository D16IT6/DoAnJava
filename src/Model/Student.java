/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
public class Student extends Person{
    private String masv;
    private String maLop;

    public Student() {
    }

    public Student(String masv, String maLop) {
        this.masv = masv;
        this.maLop = maLop;
    }

    @Override
    public String toString() {        
        return "\nSinh Viên " + "Mã Sinh Viên:" + masv + "Tên "+super.getTen()+" Mã Lớp:" + maLop ;
    }

    public Student(String masv, String maLop, String hodem, String ten, String ngaysinh, String email, String quequan) {
        super(hodem, ten, ngaysinh, email, quequan);
        this.masv = masv;
        this.maLop = maLop;
    }

    public Student(String masv) {
        this.masv = masv;
    }
    
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    

   
   
    
}

