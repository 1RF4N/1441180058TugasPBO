package com.irfan;

/**
 * Created by win7 on 10/06/2015.
 */
public class Testing {

    public static void main(String[] args) {
        System.out.println("FAKTUR PENJUALAH OLSHOP");
        System.out.println("======================================");

        Owner irfan = new Owner ("Muhammad Irfan","BCT F3-13",'L',"Perjaka Muda",19);
        Owner ririn = new Owner ("Ririn Nur Fitria","Madyopuro 2",'P',"Gadis Muda",19);
        Olshop Jaket = new Olshop ("Volcomm",125000.0,"Jaket",irfan);
        Olshop Sepatu = new Olshop ("Docmart",325000.0,"Sepatu",ririn);

        irfan.setStatusOwner("Perjaka Biasa");
        ririn.setStatusOwner("Gadis Biasa");

        System.out.println(irfan.toString());
        System.out.println(Jaket.getPoweredBy().getStatusOwner());

        System.out.println("");
        System.out.println(ririn.toString());
        System.out.println(Sepatu.getPoweredBy().getStatusOwner());

        System.out.println("======================================");
    }
}