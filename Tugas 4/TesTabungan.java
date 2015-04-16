import java.util.Scanner;

class TesTabungan
{
	public static void main(String[] args)
	{
		int simpanan;

		Tabungan irfan = new Tabungan(100000);

		Scanner in = new Scanner(System.in);

		irfan.setSimpanan(500000);
		
		System.out.print("SELAMAT DATANG PARA NASABAH DI BANK-KRUT");
		System.out.println("Data anda:\n Nama: "+irfan.getPemilik()+"\tNorek: "+irfan.getNorek());
		System.out.println("Silakan Tentukan Pilihan Anda :");
		System.out.println("1.Menabung");
		System.out.println("2.Penarikan tunai");
		System.out.println("3.Transfer dana");
		System.out.println("4.Dana yang anda terima");
		System.out.println("5.Cek saldo");
		

		System.out.print("1 - 5: ");
		int p = in.nextInt();

		switch (p) {

			case 1 :
			System.out.println(" Silakan masukan jumlah yang akan anda masukan: ");
			int menabung = in.nextInt();
			irfan.menabung(menabung);
			irfan.ceksaldo();
			break;
			case 2 :
			System.out.println("Silakan masukan jumlah yang akan anda tarik: ");
			int menarik = in.nextInt();
			irfan.menarik(menarik);
			irfan.ceksaldo();
			break;

			case 3 :
			System.out.println("Silakan masukan jumlah yang akan anda transfer: ");
			int transfer = in.nextInt();
			irfan.transfer(transfer);
			irfan.ceksaldo();
			break;

			case 4 : 
			irfan.terima();
			break;

			case 5 :
			irfan.ceksaldo();
			break;

			default:
			System.out.print("Hanya boleh memasukkan angka 1 - 5");
		}
	}
}