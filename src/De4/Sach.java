/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

import java.io.Serializable;

/**
 *
 * @author Huong
 */
public class Sach implements Serializable{
    String ten;
    String loai;
    String hang;
    double gia;

    public Sach() {
    }

    public Sach(String ten, String loai, String hang, double gia) {
        this.ten = ten;
        this.loai = loai;
        this.hang = hang;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public  String danhGia(){
        if(gia>5000){
            return "Đắt";
        }else{
            return "Rẻ";
        }
    }
}
