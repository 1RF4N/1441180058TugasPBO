import java.util.Scanner;
public class Menu
{
	public static void main(String[] args)
	{
		for (int i=1;i<999;)
		{
		System.out.println("	  ---------------");
		System.out.println("	Kalkulator Abad 2000");
		System.out.println("	  ---------------");

		Scanner input = new Scanner (System.in);

		System.out.print("Masukkan Bilangan Pertama : ");
		int bil1 = input.nextInt();
		System.out.print("Masukkan Bilangan Kedua	  : ");
		int bil2 = input.nextInt();

		System.out.println("");
		System.out.println("Pilihan Operasi :");
		System.out.println("1. Jumlah");
		System.out.println("2. Pengurangan");
		System.out.println("3. Kali");
		System.out.println("4. Bagi");
		System.out.println("5. Exit");
		System.out.println("");

		System.out.print("Jenis operasi yang bapak inginkan : ");
		int menu = input.nextInt();

		Menu:
			switch (menu)
			{
				case 1:
				System.out.println("=> Hasil Penjumlahan " +bil1+ " + " +bil2+ " = "+(bil1+bil2));
				System.out.println("");
				break;

				case 2:
				System.out.println("=> Hasil Pengurangan " +bil1+ " - " +bil2+ " = "+(bil1-bil2));
				System.out.println("");
				break;

				case 3:
				System.out.println("=> Hasil Perkalian " +bil1+ " * " +bil2+ " = "+(bil1*bil2));
				System.out.println("");
				break;

				case 4:
				System.out.println("=> Hasil Pembagian " +bil1+ " / " +bil2+ " = "+(bil1/bil2));
				System.out.println("");
				break;

				case 5:
				System.out.println("=> Anda Memilih Keluar. . .As See You Soon :)");
					System.exit(0);
				System.out.println("");
				break;

				default:
				System.out.println("=> Maaf, Menu Yang Anda Masukkan Tidak Tersedia");
				System.out.println("");
				break;

//Copyright 2015. All Right Reserved by Muhammad Irfan A - 1441180058				
			}
		}
	}
}