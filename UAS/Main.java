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

        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Klub : " +premiere.getDaftarKlub());
        System.out.println("\n");

        //Daftar Divisi
        System.out.println("1. Get daftar divisi by nama liga");
        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Berikut Daftar Divisi Dari Liga : " +premiere.getDaftarDivisi());
        System.out.println("\n");

        //Nama Klub + Divisinya
        System.out.println("2. Get daftar klub by nama liga");
        System.out.println("Liga : " +premiere.getNamaLiga());
        System.out.println("Berikut Daftar Klub Dari Liga : " +premiere.getDaftarKlub());
        System.out.println("\n");


        //Nama Klub Dari Anggota Divisi
        System.out.println("3. Get daftar klub by nama divisi");
        System.out.println("Daftar Klub Dari Divisi Serie A : "+serieA.getDaftarKlub());
        System.out.println("Daftar Klub Dari Divisi Serie B : "+serieB.getDaftarKlub());
        System.out.println("Daftar Klub Dari Divisi Serie C : "+serieC.getDaftarKlub());
        System.out.println("\n");

        //Nama Klub Tertentu Berada Pada Divisi Tertentu
        System.out.println("4. Get klub ini berada di divisi mana by nama Klub");
        System.out.println("Klub        : " +satu1.getNamaKlub());
        System.out.println("Di Divisi   : " +satu1.getDivisi());
        System.out.println("\n");

        //Nama Klub Tertentu Berada Pada Liga Premiere
        System.out.println("5. Get klub ini berada di liga apa by nama klub");
	    satu1.setLiga(premiere);
        System.out.println("Di Liga     : " +satu1.getLiga());
        System.out.println("Klub        : " +satu1.getNamaKlub());
        System.out.println("\n");
    }
}