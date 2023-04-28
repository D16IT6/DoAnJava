/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class LopHP {
    private String maLopHP;
    private String tenLop;
    private String maGV;
    private String maMH;
    private int soLuongSV;
    private String ngayBD;
    private String ngayKT;

    public LopHP() {
    }

    public LopHP(String maLopHP) {
        this.maLopHP = maLopHP;
    }

    public LopHP(String maLopHP, String tenLop, String maGV, String maMH, int soLuongSV, String ngayBD, String ngayKT) {
        this.maLopHP = maLopHP;
        this.tenLop = tenLop;
        this.maGV = maGV;
        this.maMH = maMH;
        this.soLuongSV = soLuongSV;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getMaLopHP() {
        return maLopHP;
    }

    public void setMaLopHP(String maLopHP) {
        this.maLopHP = maLopHP;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
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

    public int getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(int soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    @Override
    public String toString() {
        return "LopHP{" + "maLopHP=" + maLopHP + ", tenLop=" + tenLop + ", maGV=" + maGV + ", maMH=" + maMH + ", soLuongSV=" + soLuongSV + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + '}';
    }

    
}
