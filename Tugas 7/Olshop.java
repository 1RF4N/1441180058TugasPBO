package com.irfan;

/**
 * Created by win7 on 10/06/2015.
 */
public class Olshop {
     private String merkBarang;
     private Double hargaBarang;
     private String JenisBarang;
     private Owner poweredBy;

    public Olshop() {
    }

    public Olshop(String merkBarang, Double hargaBarang, String jenisBarang, Owner poweredBy) {
        this.merkBarang = merkBarang;
        this.hargaBarang = hargaBarang;
        JenisBarang = jenisBarang;
        this.poweredBy = poweredBy;
    }

    public String getMerkBarang() {
        return merkBarang;
    }

    public void setMerkBarang(String merkBarang) {
        this.merkBarang = merkBarang;
    }

    public Double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(Double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public Owner getPoweredBy() {
        return poweredBy;
    }

    public void setPoweredBy(Owner poweredBy) {
        this.poweredBy = poweredBy;
    }

    @Override
    public String toString() {
        return "Olshop{" +
                "merkBarang='" + merkBarang + '\'' +
                ", hargaBarang=" + hargaBarang +
                ", JenisBarang='" + JenisBarang + '\'' +
                ", poweredBy=" + poweredBy +
                '}';
    }
}