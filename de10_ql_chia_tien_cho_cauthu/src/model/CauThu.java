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
public class CauThu implements Serializable{

    private int ma;
    private String ten;
    private int tuoi, mucluong;
    private static int sma=100;

    public CauThu() {
    }

    public CauThu(String ten, int tuoi, int mucluong) throws TrongEx{
        if(ten.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.tuoi = tuoi;
        this.mucluong = mucluong;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getMucluong() {
        return mucluong;
    }

    public void setMucluong(int mucluong) {
        this.mucluong = mucluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CauThu.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, tuoi, mucluong
        };
    }
}
