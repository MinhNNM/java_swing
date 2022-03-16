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
public class Phong implements Serializable{
    
    private int ma;
    private String kieu;
    private int muc, sophong;
    private static int sma=100;

    public Phong() {
    }

    public Phong(String kieu, int muc, int sophong) throws SoEx{
        if(muc<0 || sophong<0) throw new SoEx();
        this.ma = sma++;
        this.kieu = kieu;
        this.muc = muc;
        this.sophong = sophong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getMuc() {
        return muc;
    }

    public void setMuc(int muc) {
        this.muc = muc;
    }

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Phong.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, kieu, muc, sophong
        };
    }
}
