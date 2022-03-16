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
public class NguoiMua implements Serializable{
    private int ma;
    private String hoten, diachi, loai;
    private static int sma=10000;

    public NguoiMua() {
    }

    public NguoiMua(String hoten, String diachi, String loai) throws TrongEx{
        if(hoten.isEmpty() || diachi.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.loai = loai;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NguoiMua.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, hoten, diachi, loai
        };
    }
}
