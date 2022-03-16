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
public class GiangVien implements Serializable{

    private int ma;
    private String ten, diachi, trinhdo;
    private static int sma=100;

    public GiangVien() {
    }

    public GiangVien(int ma, String ten, String diachi, String trinhdo) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.trinhdo = trinhdo;
    }

    public GiangVien( String ten, String diachi, String trinhdo) throws TrongEx{
        if(ten.isEmpty() || diachi.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.trinhdo = trinhdo;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        GiangVien.sma = sma;
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
    public Object[] toObject(){
        return new Object[]{
            ma, ten, diachi, trinhdo
        };
    }
}
