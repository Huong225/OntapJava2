/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Huong
 */
public class ThongTin implements Serializable{
    String ten;
    String gt;
    String ngaySinh;
    String email;
    String nganh;
    double diem;
    String hanhKiem;

    public ThongTin() {
    }

    public ThongTin(String ten, String gt, String ngaySinh, String email, String nganh, double diem, String hanhKiem) {
        this.ten = ten;
        this.gt = gt;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.nganh = nganh;
        this.diem = diem;
        this.hanhKiem = hanhKiem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(String hanhKiem) {
        this.hanhKiem = hanhKiem;
    }
    
    public String getXepLoai(){
        if(diem<3.5){
            return "Yếu";
        }else if(diem<6.5){
            return  "TB";
        }else if(diem<8){
            return  "Khá";
        }else{
            return  "Giỏi";
        }
    }

    void setNgaySinh(Date ngay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
