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
    private String email;
    private String quequan;



    public Person() {
    }

    public Person(String hodem, String ten, String ngaysinh, String email, String quequan) {
        this.hodem = hodem;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.quequan = quequan;
    }

    public Person(String hodem, String ten) {
        this.hodem = hodem;
        this.ten = ten;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Override
    public String toString() {
        return "Person{" + "hodem=" + hodem + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", email=" + email + ", quequan=" + quequan + '}';
    }
  
}
