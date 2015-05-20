public class TestBangun
{
	public static void main(String[] args)
	{
		Segitiga bangunku = new Segitiga();

		bangunku.alas 	= 5;
		bangunku.tinggi = 5;
		bangunku.a 		= 5;
		bangunku.b 		= 5;

		System.out.println("");
		System.out.println(" 	SEGITIGA");
		System.out.println("   +++ Property Aseli +++");
		bangunku.cetakKeLayar();
		System.out.println("Luas 		: "+bangunku.hitungLuas());
		System.out.println("Keliling 	: "+bangunku.hitungKeliling());

		bangunku.ubahProperty(7, 7, 7, 7);

		System.out.println("");
		System.out.println("   +++ Property Baru +++");
		bangunku.cetakKeLayar();
		System.out.println("Luas Baru	: "+bangunku.hitungLuas());
		System.out.println("Keliling Baru 	: "+bangunku.hitungKeliling());

		/*##################################################################*/

		System.out.println("");
		System.out.println("###########################");
		Lingkaran bolongan = new Lingkaran();

		bolongan.jejari 	= 3;

		System.out.println("");
		System.out.println(" 	LINGKARAN");
		System.out.println("   +++ Property Aseli +++");
		bolongan.cetakKeLayar();
		System.out.println("Luas 		: "+bolongan.hitungLuas());
		System.out.println("Keliling 	: "+bolongan.hitungKeliling());

		bolongan.ubahProperty(7);

		System.out.println("");
		System.out.println("   +++ Property Baru +++");
		bolongan.cetakKeLayar();
		System.out.println("Luas Baru	: "+bolongan.hitungLuas());
		System.out.println("Keliling Baru 	: "+bolongan.hitungKeliling());
	}
}