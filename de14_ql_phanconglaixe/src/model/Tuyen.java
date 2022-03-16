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
public class Tuyen implements Serializable{

    private int ma, khoangcach, sodiemdung;
    private static int sma=100;

    public Tuyen() {
    }

    public Tuyen(int ma, int khoangcach, int sodiemdung) {
        this.ma = ma;
        this.khoangcach = khoangcach;
        this.sodiemdung = sodiemdung;
    }

    public Tuyen(int khoangcach, int sodiemdung) throws SoEx{
        if(khoangcach<0 || sodiemdung<0) throw new SoEx();
        this.ma = sma++;
        this.khoangcach = khoangcach;
        this.sodiemdung = sodiemdung;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(int khoangcach) {
        this.khoangcach = khoangcach;
    }

    public int getSodiemdung() {
        return sodiemdung;
    }

    public void setSodiemdung(int sodiemdung) {
        this.sodiemdung = sodiemdung;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Tuyen.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma, khoangcach, sodiemdung
        };
    }
}
