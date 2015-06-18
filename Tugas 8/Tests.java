package com.irfan;

/**
 * Created by win7 on 17/06/2015.
 */
public class Tests {

    public static void main(String[] args) {

        Rekening irfan = new Rekening(2000000.0);
        System.out.println(irfan.toString());
        Nasabah bolank = new Nasabah("Muhammad Irfan",122690);
        System.out.println(bolank.toString());

        bolank.setRekening(475850);
        System.out.println(bolank.toString());

        System.out.println();
        irfan.tarik(500000.0);
        System.out.println("Anda Telah Mengambil Tabungan Sebesar = Rp. 500.000");
        System.out.println("Saldo Anda Sekarang = " + irfan.getSaldo());

        System.out.println();
        irfan.setor(600000.0);
        System.out.println("Anda Telah Menyetor Tabungan Sebesar = Rp. 500.000");
        System.out.println("Saldo Anda Sekarang = " + irfan.getSaldo());

//Powered By Muhammad Irfan Awaluddien - 1441180058
    }
}