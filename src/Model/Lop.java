/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Lop {
    private String maLop;
    private String tenLop;
    private String maNganh;
    private String maGV;
    private int soLuongSV;
    private String ngayBD;
    private String ngayKT;

    public Lop(String maLop, String tenLop, String maNganh, String maGV, int soLuongSV, String ngayBD, String ngayKT) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maNganh = maNganh;
        this.maGV = maGV;
        this.soLuongSV = soLuongSV;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public Lop() {
    }
    public Lop(String maLop) {
        this.maLop = maLop;
    }
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
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
        return "Lop{" + "maLop=" + maLop + ", tenLop=" + tenLop + ", maNganh=" + maNganh + ", maGV=" + maGV + ", soLuongSV=" + soLuongSV + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + '}';
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

  
    
}
