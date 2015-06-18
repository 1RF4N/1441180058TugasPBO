package com.irfan;

/**
 * Created by win7 on 17/06/2015.
 */
public class Rekening {
    public double saldo;

    public Rekening(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double tarik){
        this.saldo = saldo - tarik;
    }

    public void setor (double setor){
        this.saldo = saldo + setor;
    }

    @Override
    public String toString() {
        return "" +
                "Jumlah Saldo Anda Saat Ini " + saldo +
                '}';
    }
}