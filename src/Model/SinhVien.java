/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;
public class SinhVien {
    private String masv;
    private String hodem;
    private String ten;
    private date ngaysinh;
    private String quequan;
    private String sdt;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String masv, String hodem, String ten, date ngaysinh, String quequan, String sdt, String email) {
        this.masv = masv;
        this.hodem = hodem;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    public String getHodem() {
        return hodem;
    }

    public String getTen() {
        return ten;
    }

    public date getNgaysinh() {
        return ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgaysinh(date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
}

