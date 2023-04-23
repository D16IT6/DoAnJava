/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Nganh {
    private String maNganh;
    private String tenNganh;

    @Override
    public String toString() {
        return "Nganh{" + "maNganh=" + maNganh + ", tenNganh=" + tenNganh + '}';
    }

    public Nganh() {
    }

    public Nganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public Nganh(String maNganh, String tenNganh) {
        this.maNganh = maNganh;
        this.tenNganh = tenNganh;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }
    
}
