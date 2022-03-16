/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoEx;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class LoaiVe implements Serializable{
    private int ma;
    private String loaive;
    private double dongia;
    private static int sma=10000;

    public LoaiVe() {
    }

    public LoaiVe(int ma, String loaive, double dongia) {
        this.ma = ma;
        this.loaive = loaive;
        this.dongia = dongia;
    }

    public LoaiVe(String loaive, double dongia) throws SoEx{
        if(dongia<=0) throw new SoEx();
        this.ma = sma++;
        this.loaive = loaive;
        this.dongia = dongia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLoaive() {
        return loaive;
    }

    public void setLoaive(String loaive) {
        this.loaive = loaive;
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
        LoaiVe.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, loaive, dongia
        };
    }
}
