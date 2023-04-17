/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oracle.model;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author trilo
 */
public class DonHangModel {
    int MaDH;
    String thoiGianDatHang;
    int trangThaiDH;
    int tongGiaTriDH;
    NhanVienModel nhanVien;
    String MoTaDH;
    BanModel ban;

    public DonHangModel() {
    }

    public DonHangModel(int MaDH, String thoiGianDatHang, int trangThaiDH, int tongGiaTriDH, NhanVienModel nhanVien, String MoTaDH, BanModel ban) {
        this.MaDH = MaDH;
        this.thoiGianDatHang = thoiGianDatHang;
        this.trangThaiDH = trangThaiDH;
        this.tongGiaTriDH = tongGiaTriDH;
        this.nhanVien = nhanVien;
        this.MoTaDH = MoTaDH;
        this.ban = ban;
    }

    public int getMaDH() {
        return MaDH;
    }

    public void setMaDH(int MaDH) {
        this.MaDH = MaDH;
    }

    public String getThoiGianDatHang() {
        return thoiGianDatHang;
    }

    public void setThoiGianDatHang(String thoiGianDatHang) {
        this.thoiGianDatHang = thoiGianDatHang;
    }

    public int getTrangThaiDH() {
        return trangThaiDH;
    }

    public void setTrangThaiDH(int trangThaiDH) {
        this.trangThaiDH = trangThaiDH;
    }

    public int getTongGiaTriDH() {
        return tongGiaTriDH;
    }

    public void setTongGiaTriDH(int tongGiaTriDH) {
        this.tongGiaTriDH = tongGiaTriDH;
    }

    public NhanVienModel getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVienModel nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMoTaDH() {
        return MoTaDH;
    }

    public void setMoTaDH(String MoTaDH) {
        this.MoTaDH = MoTaDH;
    }

    public BanModel getBan() {
        return ban;
    }

    public void setBan(BanModel ban) {
        this.ban = ban;
    }
    
}
