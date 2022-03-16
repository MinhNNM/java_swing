/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class KhachHang implements Serializable{
    
    private int ma;
    private String hoten, diachi, nhomKH;
    private static int sma=10000;

    public KhachHang() {
    }

    public KhachHang(String hoten, String diachi, String nhomKH) throws TrongEx{
        if(hoten.isEmpty() || diachi.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.nhomKH = nhomKH;
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

    public String getNhomKH() {
        return nhomKH;
    }

    public void setNhomKH(String nhomKH) {
        this.nhomKH = nhomKH;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, hoten, diachi, nhomKH
        };
    }
}
