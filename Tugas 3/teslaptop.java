class teslaptop
{
	public static void main(String[] args)
	{
//instansiasi objek
//namaClass namaObjek = namaKonstruktor
	laptop bolank = new laptop();

	bolank.menyala();
	System.out.println(" Merk 			= " + bolank.getMerk());
	System.out.println(" Warna 			= "	+ bolank.getWarna());
	System.out.println(" Koneksi wifi anda	= " + bolank.getWifi());
	System.out.println(" Baterai anda tinggal 	= " + bolank.getBaterai()+"%");
	bolank.mati();
	}
}