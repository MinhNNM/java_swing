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
public class Sach implements Serializable{
    
    private int ma;
    private String ten, tacgia, chuyennganh;
    private int namsx;
    private static int sma=10000;

    public Sach() {
    }

    public Sach( String ten, String tacgia, String chuyennganh, int namsx) throws SoExcep{
       
        if(namsx<0) throw new SoExcep();
        this.ma = sma++;
        this.ten = ten;
        this.tacgia = tacgia;
        this.chuyennganh = chuyennganh;
        this.namsx = namsx;
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

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, ten, tacgia, chuyennganh, namsx
        };
    }
}
