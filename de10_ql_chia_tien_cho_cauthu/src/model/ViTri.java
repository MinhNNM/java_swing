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
public class ViTri implements Serializable{
    private int ma;
    private String ten;
    private int mucthuong;
    private static int sma=100;

    public ViTri() {
    }

    public ViTri(int ma, String ten, int mucthuong) {
        this.ma = ma;
        this.ten = ten;
        this.mucthuong = mucthuong;
    }

    public ViTri(String ten, int mucthuong) throws TrongEx{
        if(ten.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.mucthuong = mucthuong;
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

    public int getMucthuong() {
        return mucthuong;
    }

    public void setMucthuong(int mucthuong) {
        this.mucthuong = mucthuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ViTri.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, mucthuong
        };
    }
    
}
