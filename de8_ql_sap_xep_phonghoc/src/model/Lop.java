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
public class Lop implements Serializable{
    private int ma;
    private String ten;
    private int sosv;
    private static int sma=100;

    public Lop() {
    }

    public Lop(int ma, String ten, int sosv) {
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
    }

    public Lop(String ten, int sosv) throws TrongEx{
        if(ten.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.sosv = sosv;
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

    public int getSosv() {
        return sosv;
    }

    public void setSosv(int sosv) {
        this.sosv = sosv;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Lop.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, sosv
        };
    }
}
