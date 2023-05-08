/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class ctLopHP {
    private String maLopHP;
    private String MaSV;
    private String maGV;
    private String maMH;
    private String tenLopHP;
    private String tenGV;
    private String tenSV;
    private String tenMH;
    private int soTiet;
    private int soLuongSV;

    public ctLopHP(String maLopHP, String MaSV, String maGV, String maMH, String tenLopHP, String tenGV, String tenSV, String tenMH, int soTiet, int soLuongSV) {
        this.maLopHP = maLopHP;
        this.MaSV = MaSV;
        this.maGV = maGV;
        this.maMH = maMH;
        this.tenLopHP = tenLopHP;
        this.tenGV = tenGV;
        this.tenSV = tenSV;
        this.tenMH = tenMH;
        this.soTiet = soTiet;
        this.soLuongSV = soLuongSV;
    }

    public ctLopHP() {
    }

    public String getMaLopHP() {
        return maLopHP;
    }

    public void setMaLopHP(String maLopHP) {
        this.maLopHP = maLopHP;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenLopHP() {
        return tenLopHP;
    }

    public void setTenLopHP(String tenLopHP) {
        this.tenLopHP = tenLopHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public int getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(int soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    @Override
    public String toString() {
        return "ctLopHP{" + "maLopHP=" + maLopHP + ", MaSV=" + MaSV + ", maGV=" + maGV + ", maMH=" + maMH + ", tenLopHP=" + tenLopHP + ", tenGV=" + tenGV + ", tenSV=" + tenSV + ", tenMH=" + tenMH + ", soTiet=" + soTiet + ", soLuongSV=" + soLuongSV + '}';
    }
    
}
