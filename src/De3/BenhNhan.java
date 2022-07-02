/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3;

import java.io.Serializable;

/**
 *
 * @author Huong
 */
public class BenhNhan implements Serializable{
    String ten;
    int tuoi;
    String gioiTinh;
    String phong;
    String danToc;

    public BenhNhan() {
    }

    public BenhNhan(String ten, int tuoi, String gioiTinh, String phong, String danToc) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.phong = phong;
        this.danToc = danToc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }
    
    public String trangThai(){
        if(phong=="Cấp cứu"){
            return "Nhập viện";
        }else{
            return "Bình thường";
        }
    }
}
