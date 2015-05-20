public class Segitiga
{
	int alas;
	int tinggi;
	int a;
	int b;

	public void cetakKeLayar()
	{
		System.out.println("Alas 		: "+alas);
		System.out.println("Tinggi 		: "+tinggi);
		System.out.println("A 		: "+a);
		System.out.println("B 		: "+b);
	}

	public void ubahProperty (int alasBaru, int tinggiBaru, int aBaru, int bBaru)
	{
		alas 	= alasBaru;
		tinggi 	= tinggiBaru;
		a 		= aBaru;
		b 		= bBaru;
	}

	public double hitungLuas()
	{
		double luas;
		luas = 0.5 * alas * tinggi;
		return luas;
	}

	public int hitungKeliling()
	{
		int keliling;
		keliling = a + b + alas;
		return keliling;
	}
}