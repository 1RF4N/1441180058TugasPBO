class laptop
{
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public laptop()
	{
		merk		= "Toshiba";
		warna		= "Hitam";
		wifi		= "Terhubung";
		baterai 	= 100;
	}

	public laptop (String merkInput, String warnaInput)
	{
		merk		= merkInput;
		warna		= warnaInput;
	}
	public laptop (String merkInput, String warnaInput, String wifiInput)
	{
		merk		= merkInput;
		warna		= warnaInput;
		wifi 		= wifiInput;
	}
	public laptop (String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		merk		= merkInput;
		warna		= warnaInput;
		wifi 		= wifiInput;
		baterai		= bateraiInput;
	}
	
	public void menyala()
	{
		System.out.println("Welcome To Laptop");
	}
	public void mati()
	{
		System.out.println("Thankyou Have A Nice Day");
	}
	public void indikatorbaterai()
	{
		System.out.println("Baterai anda tinggal " + baterai + "%");
	}
	public void indikatorwifi()
	{
		System.out.println("Koneksi wifi anda " + wifi);
	}

	public String getMerk()
	{
		return merk;
	}
	public String getWarna()
	{
		return warna;
	}
	public int getBaterai()
	{
		return baterai;
	}
	public String getWifi()
	{
		return wifi;
	}

	public void setMerk(String m)
	{
		merk = m;
	}
	public void setWarna(String w)
	{
		warna = w;
	}
	public void setBaterai(int b)
	{
		baterai = b;
	}
	public void setWifi(String f)
	{
		wifi = f;
	}
}