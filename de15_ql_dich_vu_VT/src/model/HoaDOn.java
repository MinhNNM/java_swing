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
    private DichVu dv;
    private int soluong;

    public HoaDOn() {
    }

    public HoaDOn(KhachHang kh, DichVu dv, int soluong) throws SoEx{
        if(soluong<0) throw new SoEx();
        this.kh = kh;
        this.dv = dv;
        this.soluong = soluong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public DichVu getDv() {
        return dv;
    }

    public void setDv(DichVu dv) {
        this.dv = dv;
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
            kh.getMa(), dv.getMa(), kh.getHoten(), dv.getTen(), soluong
        };
    }
}
