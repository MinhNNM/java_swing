/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoExcep;
import controller.TrongExcep;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class Bang implements Serializable{
    private Sach s;
    private KeSach ks;
    private int slg;
    private String tinhtrang;

    public Bang() {
    }

    public Bang(Sach s, KeSach ks, int slg, String tinhtrang) throws SoExcep{
        if(slg<0) throw new SoExcep();
        //if(tinhtrang.isEmpty()) throw new TrongExcep();
        this.s = s;
        this.ks = ks;
        this.slg = slg;
        this.tinhtrang=tinhtrang;
    }

    public Sach getS() {
        return s;
    }

    public void setS(Sach s) {
        this.s = s;
    }

    public KeSach getKs() {
        return ks;
    }

    public void setKs(KeSach ks) {
        this.ks = ks;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
    public Object[] toObject(){
        return new Object[]{
            s.getMa(), ks.getMa(), s.getTen(), ks.getTen(), slg, tinhtrang
        };
    }
}
