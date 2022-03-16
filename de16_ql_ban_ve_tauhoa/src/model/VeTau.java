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
public class VeTau implements Serializable{
    private int ma;
    private String loai;
    private double dongia;
    private static int sma=10000;

    public VeTau() {
    }

    public VeTau(int ma, String loai, double dongia) {
        this.ma = ma;
        this.loai = loai;
        this.dongia = dongia;
    }

    public VeTau(String loai, double dongia) throws TrongEx, SoEx{
        if(loai.isEmpty()) throw new TrongEx();
        if(dongia<0) throw new SoEx();
        this.ma = sma++;
        this.loai = loai;
        this.dongia = dongia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        VeTau.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, loai, dongia
        };
    }
}
