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
public class BangPhanCong implements Serializable{
    private LaiXe lx;
    private Tuyen t;
    private int soluot;

    public BangPhanCong() {
    }

    public BangPhanCong(LaiXe lx, Tuyen t, int soluot) throws SoEx{
        if(soluot<0) throw new SoEx();
        this.lx = lx;
        this.t = t;
        this.soluot = soluot;
    }

    public LaiXe getLx() {
        return lx;
    }

    public void setLx(LaiXe lx) {
        this.lx = lx;
    }

    public Tuyen getT() {
        return t;
    }

    public void setT(Tuyen t) {
        this.t = t;
    }

    public int getSoluot() {
        return soluot;
    }

    public void setSoluot(int soluot) {
        this.soluot = soluot;
    }
    public String getTEN(){
        return lx.getHoten();
    }
    public Object[] toObject(){
        return new Object[]{
            lx.getMa(), t.getMa(), lx.getHoten(), soluot
        };
    }
}
