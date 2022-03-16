/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoExcep;
import controller.TrongExcep;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class KeSach implements Serializable{
    private int ma;
    private String ten, loai;
    private int slgmax;
    private static int sma=100;

    public KeSach() {
    }

    public KeSach(int ma, String ten, String loai, int slgmax) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.slgmax = slgmax;
    }

    public KeSach(String ten, String loai, int slgmax) throws SoExcep{
        
        if(slgmax<0) throw new SoExcep();
        this.ma = sma++;
        this.ten = ten;
        this.loai = loai;
        this.slgmax = slgmax;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSlgmax() {
        return slgmax;
    }

    public void setSlgmax(int slgmax) {
        this.slgmax = slgmax;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KeSach.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, loai, slgmax
        };
    }
}
