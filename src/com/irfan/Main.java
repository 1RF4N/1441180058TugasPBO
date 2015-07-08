package com.irfan;

/**
 * Created by win7 on 06/07/2015.
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Liga premiere = new Liga("Premiere League");
        Divisi serieA = new Divisi("Serie A");
        Divisi serieB = new Divisi("Serie B");
        Divisi serieC = new Divisi("Serie C");

        Klub satu1 = new Klub("Arsenal",serieA,premiere);
        Klub satu2 = new Klub("Aston Villa",serieA);
        Klub dua1 = new Klub("Manchester City",serieB);
        Klub dua2 = new Klub("Manchester United",serieB,premiere);
        Klub tiga1 = new Klub("Tottenham Hotspur",serieC,premiere);
        Klub tiga2 = new Klub("West Ham United",serieC);

        premiere.setDaftarDivisi(serieA); premiere.setDaftarDivisi(serieB); premiere.setDaftarDivisi(serieC);

        premiere.setDaftarKlub(satu1); premiere.setDaftarKlub(satu2);
        premiere.setDaftarKlub(dua1); premiere.setDaftarKlub(dua2);
        premiere.setDaftarKlub(tiga1); premiere.setDaftarKlub(tiga2);

        serieA.setDaftarKlub(satu1); serieA.setDaftarKlub(satu2);
        serieB.setDaftarKlub(dua1); serieB.setDaftarKlub(dua2);
        serieC.setDaftarKlub(tiga1); serieC.setDaftarKlub(tiga2);

        //Liga N Divisi + Klub
        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Divisi : " +premiere.getDaftarDivisi());
        System.out.println("\n");

        //Liga N Divisi + Semua Anggota Klub
        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Klub : " +premiere.getDaftarKlub());
        System.out.println("\n");

        //Liga N Nama Klub + Masing Maisng Divisi
        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Klub : " +serieA.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Klub : " +serieB.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Klub : " +serieC.getDaftarKlub());
        System.out.println("\n");

        //Liga N 1Klub + Nama Divisinya
        System.out.println("Liga   : " +satu1.getLiga());
        System.out.println("Klub   : " +satu1.getNamaKlub());
        System.out.println("Divisi : " +satu1.getDivisi());
        System.out.println("\n");
        System.out.println("Liga   : " +dua2.getLiga());
        System.out.println("Klub   : " +dua2.getNamaKlub());
        System.out.println("Divisi : " +dua2.getDivisi());
        System.out.println("\n");
        System.out.println("Liga   : " +tiga1.getLiga());
        System.out.println("Klub   : " +tiga1.getNamaKlub());
        System.out.println("Divisi : " +tiga1.getDivisi());
        System.out.println("\n");
    }
}