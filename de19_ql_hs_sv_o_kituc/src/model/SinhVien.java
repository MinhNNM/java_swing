/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.LopEx;
import controller.NSEx;
import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class SinhVien implements Serializable{
    private int ma;
    private String hoten, diachi, ngaysinh, lop;
    private static int sma=10000;

    public SinhVien() {
    }

    public SinhVien( String hoten, String diachi, String ngaysinh, String lop) throws TrongEx, LopEx, NSEx{
        if(!lop.toUpperCase().matches("^[D]{1}\\d{2}[A-Z]{4}\\d{2}[-]{1}[B]$")) throw new LopEx();
        if(hoten.isEmpty() || diachi.isEmpty()) throw new TrongEx();
        if(!ngaysinh.matches("\\d{2}[-/]\\d{2}[-/]\\d{4}")) throw new NSEx();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SinhVien.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, hoten, diachi, ngaysinh, lop
        };
    }
}
