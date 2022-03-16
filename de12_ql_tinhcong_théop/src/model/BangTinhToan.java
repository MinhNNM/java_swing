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
public class BangTinhToan implements Serializable{
    private CongNhan cn;
    private SanPham sp;
    private int soluong;

    public BangTinhToan() {
    }

    public BangTinhToan(CongNhan cn, SanPham sp, int soluong) throws SoEx{
        if(soluong<0) throw new SoEx();
        this.cn = cn;
        this.sp = sp;
        this.soluong=soluong;
    }

    public CongNhan getCn() {
        return cn;
    }

    public SanPham getSp() {
        return sp;
    }
    public String getTEN(){
        
        return cn.getTen();
    }

    public int getSoluong() {
        return soluong;
    }
    public Object[] toObject(){
        return new Object[]{
            cn.getMa(), sp.getMa(), cn.getTen(), sp.getTen(), soluong
        };
    }
}
