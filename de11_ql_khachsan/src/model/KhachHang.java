/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoEx;
import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class KhachHang implements Serializable{
    
    private int ma;
    private String ten, loai;
    private int sophong;
    private static int sma=100;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String loai, int sophong) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.sophong = sophong;
    }
    
    public KhachHang(String ten, String loai, int sophong) throws TrongEx, SoEx{
        if(ten.isEmpty() || loai.isEmpty()) throw new TrongEx();
        if(sophong<0) throw new SoEx();
        this.ma = sma++;
        this.ten = ten;
        this.loai = loai;
        this.sophong = sophong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
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

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, loai, sophong
        };
    }
}
