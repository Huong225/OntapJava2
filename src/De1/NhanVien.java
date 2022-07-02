/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import java.io.Serializable;

/**
 *
 * @author Huong
 */
public class NhanVien implements Serializable{
    String hoTen;
    String phong;
    String gioiTinh;
    double luong;

    public NhanVien(String hoTen, String phong, String gioiTinh, double luong) {
        this.hoTen = hoTen;
        this.phong = phong;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public String getStatus(){
        return "Đang làm việc";
    }
}
