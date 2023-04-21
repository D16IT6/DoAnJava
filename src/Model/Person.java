/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Person {
    private String hodem;
    private String ten;
    private String ngaysinh;
    private String Khoa;
    private String email;

    public Person(String hodem, String ten, String ngaysinh, String Khoa, String email) {
        this.hodem = hodem;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.Khoa = Khoa;
        this.email = email;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" + "hodem=" + hodem + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", Khoa=" + Khoa + ", email=" + email + '}';
    }

    public String getHodem() {
        return hodem;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
