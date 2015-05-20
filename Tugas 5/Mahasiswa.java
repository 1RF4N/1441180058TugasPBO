public class Mahasiswa
{
	//atribut
	private String nama;
	private int umur;

	//konstructor
	public Mahasiswa()
	{
		nama	= "Ridwan Rismanto";
		umur	= 20;
	}

	public Mahasiswa (String namaInput, int umurInput)
	{
		nama	= namaInput;
		umur	= umurInput;
	}

	//method
	public void tampilkanBiodata()
	{
		System.out.println("::: BIODATA :::");
		System.out.println("Nama:	"+nama);
		System.out.println("Umur:	"+umur);
	}

	//getter
	public String getNama()
	{
		return nama;
	}
	public int getUmur()
	{
		return umur;
	}

	//setter
	public void setNama(String n)
	{
		nama = n;
	}
	public void setUmur(int u)
	{
		umur = u;
	}
}