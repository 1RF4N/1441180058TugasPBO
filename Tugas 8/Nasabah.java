package com.irfan;

/**
 * Created by win7 on 17/06/2015.
 */
public class Nasabah {
    public String nama;
    public double rekening;

    public Nasabah(String nama, int rekening) {
        this.nama = nama;
        this.rekening = rekening;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getRekening() {
        return rekening;
    }

    public void setRekening(double rekening) {
        this.rekening = rekening;
    }

    @Override
    public String toString() {
        return "Data Nasabah : " +
                "Nama Nasabah = '" + nama + '\'' +
                ", Nomer Rekening = " + rekening +
                '}';
    }
}