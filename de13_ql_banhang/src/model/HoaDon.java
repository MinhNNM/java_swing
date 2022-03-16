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
public class HoaDon implements Serializable{
    private KhachHang kh;
    private MatHang mh;
    private int soluong;

    public HoaDon() {
    }

    public HoaDon(KhachHang kh, MatHang mh, int soluong) throws SoEx{
        if(soluong<0) throw new SoEx();
        this.kh = kh;
        this.mh = mh;
        this.soluong = soluong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
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
            kh.getMa(), mh.getMa(), kh.getHoten(), mh.getTen(), soluong
        };
    }
}
