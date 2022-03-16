/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.NSEx;
import java.io.Serializable;

/**
 *
 * @author MinhNN
 */
public class DanhSach implements Serializable{
    private SinhVien sv;
    private Phong p;
    private String ngaybd;

    public DanhSach() {
    }

    public DanhSach(SinhVien sv, Phong p, String ngaybd) throws NSEx{
        if(!ngaybd.matches("\\d{2}[-/]\\d{2}[-/]\\d{4}")) throw new NSEx();
        this.sv = sv;
        this.p = p;
        this.ngaybd = ngaybd;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }
    public String getTENSV(){
        return sv.getHoten();
    }
    public String getTENP(){
        return p.getTen();
    }
    public long getTien(String loai){
        if(loai.equalsIgnoreCase("VIP"))
            return 1000;
        else if(loai.equalsIgnoreCase("Chat luong cao"))
            return 500;
        else
            return 300;
    }
    public Object[] toObject(){
        return new Object[]{
            sv.getMa(), p.getMa(), sv.getHoten(), p.getTen(), ngaybd
        };
    }
}
