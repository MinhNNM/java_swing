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
public class DanhSach implements Serializable{
    private Phong p;
    private KhachHang kh;
    private int songaythue;

    public DanhSach() {
    }

    public DanhSach(Phong p, KhachHang kh, int songaythue) throws SoEx {
        if(songaythue<0) throw new SoEx();
        this.p = p;
        this.kh = kh;
        this.songaythue = songaythue;
    }

    public Phong getP() {
        return p;
    }

    public KhachHang getKh() {
        return kh;
    }

    public int getSongaythue() {
        return songaythue;
    }
    public int sophong(){
        return p.getSophong()-kh.getSophong();
    }
    
    public Object[] toObject(){
        return new Object[]{
            p.getMa(), kh.getMa(), p.getKieu(), kh.getTen(), songaythue
        };
    }
}
