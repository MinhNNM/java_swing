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
public class DuAn implements Serializable{
    private int ma;
    private String ten, kieu;
    private int tongcphi;
    private static int sma=10000;

    public DuAn() {
    }

    public DuAn(String ten, String kieu, int tongcphi) throws TronEx {
        if(ten.isEmpty() || kieu.isEmpty()) throw new TronEx();
        this.ma = sma++;
        this.ten = ten;
        this.kieu = kieu;
        this.tongcphi = tongcphi;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getTongcphi() {
        return tongcphi;
    }

    public void setTongcphi(int tongcphi) {
        this.tongcphi = tongcphi;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DuAn.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, kieu, tongcphi
        };
    }
}
