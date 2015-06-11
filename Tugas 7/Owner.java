package com.irfan;

/**
 * Created by win7 on 10/06/2015.
 */
    public class Owner {
        private String namaOwner;
        private String alamatOwner;
        private char jenisKelaminOwner;
        public String statusOwner;
        private int umurOwner;

    public Owner() {
    }

    public Owner(String namaOwner, String alamatOwner, char jenisKelaminOwner, String statusOwner, int umurOwner) {
        this.namaOwner = namaOwner;
        this.alamatOwner = alamatOwner;
        this.jenisKelaminOwner = jenisKelaminOwner;
        this.statusOwner = statusOwner;
        this.umurOwner = umurOwner;
    }

    public String getNamaOwner() {
        return namaOwner;
    }

    public void setNamaOwner(String namaOwner) {
        this.namaOwner = namaOwner;
    }

    public String getAlamatOwner() {
        return alamatOwner;
    }

    public void setAlamatOwner(String alamatOwner) {
        this.alamatOwner = alamatOwner;
    }

    public char getJenisKelaminOwner() {
        return jenisKelaminOwner;
    }

    public void setJenisKelaminOwner(char jenisKelaminOwner) {
        this.jenisKelaminOwner = jenisKelaminOwner;
    }

    public String getStatusOwner() {
        return statusOwner;
    }

    public void setStatusOwner(String statusOwner) {
        this.statusOwner = statusOwner;
    }

    public int getUmurOwner() {
        return umurOwner;
    }

    public void setUmurOwner(int umurOwner) {
        this.umurOwner = umurOwner;
    }

    @Override
    public String toString() {
        return "Owner ==>{" +
                "Nama = '" + namaOwner + '\'' +
                ", Alamat = '" + alamatOwner + '\'' +
                ", Jenis Kelamin = " + jenisKelaminOwner +
                ", Status = '" + statusOwner + '\'' +
                ", Umur = " + umurOwner +
                '}';
    }
}