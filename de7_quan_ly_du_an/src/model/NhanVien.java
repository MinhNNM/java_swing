/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TronEx;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class NhanVien implements Serializable{
    private int ma;
    private String ten, dchi, chuyenmon;
    private static int sma=10000;

    public NhanVien() {
    }

    public NhanVien(int ma, String ten, String dchi, String chuyenmon) {
        this.ma = ma;
        this.ten = ten;
        this.dchi = dchi;
        this.chuyenmon = chuyenmon;
    }
    
    public NhanVien(String ten, String dchi, String chuyenmon) throws TronEx{
        if(ten.isEmpty() || dchi.isEmpty()) throw new TronEx();
        this.ma = sma++;
        this.ten = ten;
        this.dchi = dchi;
        this.chuyenmon = chuyenmon;
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

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
     public Object[] toObject(){
        return new Object[]{
            ma, ten, dchi, chuyenmon
        };
    }
}
