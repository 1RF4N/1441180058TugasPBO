class tesmobil
{
	public static void main(String[] args)
	{
//instansiasi objek
//namaClass namaObjek = namaKonstruktor
	mobil audy = new mobil(50000, "Sawah", "IRF 4 N", "Audy", "Hijau Langit", 60000);
	mobil ferrari = new mobil(20000, "Bunker", "P 1 SS", "Ferrari", "Biru Daun", 5000);

	System.out.println("		========================");
	System.out.println("		DAFTAR SPESIFIKASI MOBIL");
	System.out.println("		========================");

//Spesifikasi mobil sesuai objek lain yang baru dibuat
	System.out.println("1. " + audy.getMerk());	
	System.out.println(" Kecepatan 		= " + audy.getKecepatan() + " RPM");
	System.out.println(" Posisi 		= " + audy.getPosisi());
	System.out.println(" Nomor Polisi		= " + audy.getNopol());
	System.out.println(" Merk 			= " + audy.getMerk());
	System.out.println(" Warna			= " + audy.getWarna());
	System.out.println(" Mesin			= " + audy.getMesin() + " CC");

	System.out.println();
	audy.maju();
	audy.mundur();
	audy.berhenti();
	audy.belok();
	audy.ngebut();
	audy.ngerem();
	System.out.println("		=========================");

//Spesifikasi mobil sesuai objek lain yang baru dibuat
	System.out.println("2. " +ferrari.getMerk());	
	System.out.println(" Kecepatan 		= " + ferrari.getKecepatan() + " RPM");
	System.out.println(" Posisi 		= " + ferrari.getPosisi());
	System.out.println(" Nomor Polisi		= " + ferrari.getNopol());
	System.out.println(" Merk 			= " + ferrari.getMerk());
	System.out.println(" Warna			= " + ferrari.getWarna());
	System.out.println(" Mesin			= " + ferrari.getMesin() + " CC");

	System.out.println();
	ferrari.maju();
	ferrari.mundur();
	ferrari.berhenti();
	ferrari.belok();
	ferrari.ngebut();
	ferrari.ngerem();
	System.out.println("		=========================");
	}
}