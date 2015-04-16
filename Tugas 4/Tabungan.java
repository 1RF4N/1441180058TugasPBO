class Tabungan
{
	private int simpanan;
	private String pemilik;
	private int norek;
	private double bunga;
	private double jumlah;


	public Tabungan()
	{
		simpanan 	=200000;
		pemilik		="Mister Irfan";
		norek		=1441180058;
		bunga		=1;
	}

	public Tabungan(int simpananInput)
	{
		simpanan 	=simpananInput;
		pemilik		="Mister Irfan";
		norek		=1441180058;
		bunga		=2;
	}

	public Tabungan(int simpananInput, String pemilikInput)
	{
		simpanan 	=simpananInput;
		pemilik		=pemilikInput;
		norek		=1441180058;
		bunga		=2;
	}

	public Tabungan(int simpananInput, String pemilikInput,int norekInput)
	{
		simpanan 	=simpananInput;
		pemilik		=pemilikInput;
		norek		=norek;
		bunga		=2;
	}

	public void menabung(int menabung)
	{
		simpanan = simpanan + menabung;
	}

	public void menarik(int menarik)
	{
		simpanan = simpanan - menarik; 
	}

	public void transfer(int transfer)
	{
		transfer = simpanan - transfer; 
	}

	int t = (int) (Math.random()*200.000);

	public void terima()
	{
		simpanan = simpanan + t;
		System.out.print(" Anda mendapat transfer sejumlah : "+simpanan);
	}

	public void ceksaldo()
	{
		System.out.println("Saldo anda saat ini sejumlah :"+simpanan);
	}

//getter
	public int getSimpanan()
	{
		return simpanan;
	}

	public String getPemilik()
	{
		return pemilik;
	}
	public int getNorek()
	{
		return norek;
	}

//setter
	public int setSimpanan(int simpanan)
	{
		return this.simpanan = simpanan;
	}
	
	public String setPemililk(String pemilik)
	{
		return this.pemilik = pemilik;
	}
	
	public int setNorek(int norek)
	{
		return this.norek = norek;
	}

}