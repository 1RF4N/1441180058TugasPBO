//Kelas mobil
class mobil
{
	private int kecepatan;
	private String posisi;
	private String nopol;
	private String merk;
	private String warna;
	private int mesin;

//Konstruktor mobil
	public mobil()
	{
		kecepatan	= 13000;
		posisi		= "Parkir Paralel";
		nopol		= "B 0 SS";
		merk		= "Lamborghini";
		warna 		= "Abu Abu Monyet";
		mesin 		= 3000;
	}


	public mobil (int kecepatanInput, String posisiInput)
	{
		kecepatan	= kecepatanInput;
		posisi		= posisiInput;
	}
	public mobil (int kecepatanInput, String posisiInput, String nopolInput)
	{
		kecepatan	= kecepatanInput;
		posisi		= posisiInput;
		nopol		= nopolInput;
	}
	public mobil (int kecepatanInput, String posisiInput, String nopolInput, String merkInput)
	{
		kecepatan	= kecepatanInput;
		posisi		= posisiInput;
		nopol		= nopolInput;
		merk		= merkInput;
	}
	public mobil (int kecepatanInput, String posisiInput, String nopolInput, String merkInput, String warnaInput)
	{
		kecepatan	= kecepatanInput;
		posisi		= posisiInput;
		nopol		= nopolInput;
		merk		= merkInput;
		warna 		= warnaInput;
	}
	public mobil (int kecepatanInput, String posisiInput, String nopolInput, String merkInput, String warnaInput, int mesinInput)
	{
		kecepatan	= kecepatanInput;
		posisi		= posisiInput;
		nopol		= nopolInput;
		merk		= merkInput;
		warna 		= warnaInput;
		mesin 		= mesinInput;
	}
	
//Method	
	public void maju()
	{
		System.out.println(" Mobil " + merk + " Sedang Maju");
	}
	public void mundur()
	{
		System.out.println(" Mobil " + merk + " Sedang Mundur");
	}
	public void berhenti()
	{
		System.out.println(" Mobil " + merk + " Sedang Berhenti");
	}
	public void belok()
	{
		System.out.println(" Mobil " + merk + " Sedang Belok");
	}
	public void ngebut()
	{
		System.out.println(" Mobil " + merk + " Sedang Ngebut");
	}
	public void ngerem()
	{
		System.out.println(" Mobil " + merk + " Sedang Ngerem");
	}

//Mendeklarasikan method accessor dengan nama "getKecepatan()" dan bertipe integer
	public int getKecepatan()
	{
//Karena non-void, maka harus ada nilai kembalian (return value)
		return kecepatan;
	}
	public String getPosisi()
	{
		return posisi;
	}
	public String getNopol()
	{
		return nopol;
	}
	public String getMerk()
	{
		return merk;
	}
	public String getWarna()
	{
		return warna;
	}
	public int getMesin()
	{
		return mesin;
	}

//Mendeklarasikan method mutator dengan nama "setKecepatan()" dan bertipe void
	public void setKecepatan(int k)
	{
//Method setKecepatan() memiliki 1 parameter "k" dan bertipe integer
		kecepatan = k;
	}
	public void setPosisi(String p)
	{
		posisi = p;
	}
	public void setNopol(String n)
	{
		nopol = n;
	}
	public void setMerk(String b)
	{
		merk = b;
	}
	public void setWarna(String w)
	{
		warna = w;
	}
	public void setMesin(int m)
	{
		mesin = m;
	}
}