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
public class MonHoc implements Serializable{
    
    private int ma;
    private String ten;
    private int sotiet, sotiet_lt, muckp;
    private static int sma=100;

    public MonHoc() {
    }

    public MonHoc(String ten, int sotiet, int sotiet_lt, int muckp) throws TrongEx, SoEx{
        if(ten.isEmpty()) throw new TrongEx();
        if(sotiet<0 || sotiet_lt<0 || muckp<0) throw new SoEx();
        this.ma = sma++;
        this.ten = ten;
        this.sotiet = sotiet;
        this.sotiet_lt = sotiet_lt;
        this.muckp = muckp;
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

    public int getSotiet() {
        return sotiet;
    }

    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
    }

    public int getSotiet_lt() {
        return sotiet_lt;
    }

    public void setSotiet_lt(int sotiet_lt) {
        this.sotiet_lt = sotiet_lt;
    }

    public int getMuckp() {
        return muckp;
    }

    public void setMuckp(int muckp) {
        this.muckp = muckp;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, sotiet, sotiet_lt, muckp
        };
    }
}
