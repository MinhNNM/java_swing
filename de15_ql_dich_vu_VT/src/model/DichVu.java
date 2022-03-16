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
public class DichVu implements Serializable{
    private int ma;
    private String ten;
    private double giacuoc;
    private String dvi;
    private static int sma=10000;

    public DichVu() {
    }

    public DichVu(String ten, double giacuoc, String dvi) throws TrongEx, SoEx {
        if(ten.isEmpty() || dvi.isEmpty()) throw new TrongEx();
        if(giacuoc<0) throw new SoEx();
        this.ma = sma++;
        this.ten = ten;
        this.giacuoc = giacuoc;
        this.dvi = dvi;
    }

    public DichVu(int ma, String ten, double giacuoc, String dvi) {
        this.ma = ma;
        this.ten = ten;
        this.giacuoc = giacuoc;
        this.dvi = dvi;
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

    public double getGiacuoc() {
        return giacuoc;
    }

    public void setGiacuoc(double giacuoc) {
        this.giacuoc = giacuoc;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DichVu.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, ten, giacuoc, dvi
        };
    }
}
