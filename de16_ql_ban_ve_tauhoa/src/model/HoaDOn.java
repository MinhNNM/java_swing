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
public class HoaDOn implements Serializable{
    private KhachHang kh;
    private VeTau vt;
    private int soluong;

    public HoaDOn(KhachHang kh, VeTau vt, int soluong) throws SoEx{
        if(soluong<0) throw new SoEx();
        this.kh = kh;
        this.vt = vt;
        this.soluong = soluong;
    }

    public HoaDOn() {
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public VeTau getVt() {
        return vt;
    }

    public void setVt(VeTau vt) {
        this.vt = vt;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public String getTEN(){
        return kh.getHoten();
    }
    public Object[] toObject(){
        return new Object[]{
            kh.getMa(), vt.getMa(), kh.getHoten(), vt.getLoai(), soluong
        };
    }
}
