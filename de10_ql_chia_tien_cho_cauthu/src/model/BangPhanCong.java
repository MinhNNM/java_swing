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
public class BangPhanCong implements Serializable{
    private CauThu ct;
    private ViTri vt;
    private int sotran;

    public BangPhanCong() {
    }

    public BangPhanCong(CauThu ct, ViTri vt, int sotran) {
        this.ct = ct;
        this.vt = vt;
        this.sotran = sotran;
    }

    public CauThu getCt() {
        return ct;
    }

    public void setCt(CauThu ct) {
        this.ct = ct;
    }

    public ViTri getVt() {
        return vt;
    }

    public void setVt(ViTri vt) {
        this.vt = vt;
    }

    public int getSotran() {
        return sotran;
    }

    public void setSotran(int sotran) {
        this.sotran = sotran;
    }
    public String getTEN(){
        return ct.getTen();
    }
    public Object[] toObject(){
        return new Object[]{
            ct.getMa(), vt.getMa(), ct.getTen(), vt.getTen(), sotran
        };
    }
    
}
