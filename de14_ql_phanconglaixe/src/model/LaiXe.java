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
public class LaiXe implements Serializable{

    private int ma;
    private String hoten, diachi, trinhdo;
    private static int sma=10000;

    public LaiXe() {
    }

    public LaiXe(int ma, String hoten, String diachi, String trinhdo) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.trinhdo = trinhdo;
    }
    
    public LaiXe(String hoten, String diachi, String trinhdo) throws TrongEx{
        if(hoten.isEmpty() || diachi.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.trinhdo = trinhdo;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        LaiXe.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, hoten, diachi, trinhdo
        };
    }
}
