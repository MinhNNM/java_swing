/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class BangSX implements Serializable{
    private PhongHoc ph;
    private Lop lop;
    private int kip;

    public BangSX() {
    }

    public BangSX(PhongHoc ph, Lop lop, int kip) {
        this.ph = ph;
        this.lop = lop;
        this.kip = kip;
    }

    public PhongHoc getPh() {
        return ph;
    }

    public void setPh(PhongHoc ph) {
        this.ph = ph;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }
   public Object[] toObject(){
        return new Object[]{
            ph.getMa(), lop.getMa(), ph.getTen(), lop.getTen(), kip
        };
    } 
}
