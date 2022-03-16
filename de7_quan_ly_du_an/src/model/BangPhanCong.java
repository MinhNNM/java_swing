/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TronEx;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class BangPhanCong implements Serializable{
    private DuAn da;
    private NhanVien nv;
    private int songay;
    private String vitri;

    public BangPhanCong() {
    }

    public BangPhanCong(DuAn da, NhanVien nv, int songay, String vitri) throws TronEx{
        if(vitri.isEmpty()) throw new TronEx();
        this.da = da;
        this.nv = nv;
        this.songay = songay;
        this.vitri = vitri;
    }

    public DuAn getDa() {
        return da;
    }

    public void setDa(DuAn da) {
        this.da = da;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
    public String getHoten(){
        return nv.getTen();
    }
     public Object[] toObject(){
        return new Object[]{
            da.getMa(), nv.getMa(), da.getTen(), nv.getTen(), songay, vitri
        };
    }
}
