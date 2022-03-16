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
    private NguoiMua nm;
    private LoaiVe lv;
    private int soluong;

    public HoaDon() {
    }

    public HoaDon(NguoiMua nm, LoaiVe lv, int soluong) throws SoEx{
        if(soluong<=0) throw new SoEx();
        this.nm = nm;
        this.lv = lv;
        this.soluong = soluong;
    }

    public NguoiMua getNm() {
        return nm;
    }

    public void setNm(NguoiMua nm) {
        this.nm = nm;
    }

    public LoaiVe getLv() {
        return lv;
    }

    public void setLv(LoaiVe lv) {
        this.lv = lv;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public Object[] toObject(){
        return new Object[]{
            nm.getMa(), lv.getMa(), nm.getHoten(), lv.getLoaive(), soluong
        };
    }
}
