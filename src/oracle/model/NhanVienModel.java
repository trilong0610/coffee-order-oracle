/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oracle.model;

/**
 *
 * @author trilo
 */
public class NhanVienModel {
    int maNV;
    String tenNV;
    int luongNV;
    ChucVuModel chucVu;

    public NhanVienModel(int maNV, String tenNV, int luongNV, ChucVuModel chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongNV = luongNV;
        this.chucVu = chucVu;
    }

    public NhanVienModel() {
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(int luongNV) {
        this.luongNV = luongNV;
    }

    public ChucVuModel getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVuModel chucVu) {
        this.chucVu = chucVu;
    }
    
}
