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
public class BangKeKhai implements Serializable{
    private MonHoc mh;
    private GiangVien gv;
    private int solop;

    public BangKeKhai() {
    }

    public BangKeKhai(MonHoc mh, GiangVien gv, int solop) throws SoEx{
        if(solop<0) throw new SoEx();
        this.mh = mh;
        this.gv = gv;
        this.solop = solop;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public int getSolop() {
        return solop;
    }

    public void setSolop(int solop) {
        this.solop = solop;
    }
    public String getTEN(){
        return gv.getTen();
    }
    public int getSotiet(){
        return mh.getSotiet()*solop;
    }
    public Object[] toObject(){
        return new Object[]{
            mh.getMa(), gv.getMa(), mh.getTen(), gv.getTen(), solop, mh.getSotiet()*solop
        };
    }
}
