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
public class SanPham implements Serializable{
    private int ma;
    private String ten;
    private int dongia;
    private static int sma=10000;

    public SanPham(int ma, String ten, int dongia) {
        this.ma = ma;
        this.ten = ten;
        this.dongia = dongia;
    }

    public SanPham() {
    }

    public SanPham(String ten, int dongia) throws TrongEx, SoEx{
        if(ten.isEmpty()) throw new TrongEx();
        if(dongia<0) throw new SoEx();
        this.ma = sma++;
        this.ten = ten;
        this.dongia = dongia;
    }

    public int getMa() {
        return ma;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SanPham.sma = sma;
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

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, dongia
        };
    }
}
