public class enam {
	public static void main(String[] args) {
		int a=10;
		int hasil=0;
		int i=1;
		while(i<=a){
			System.out.print(i);
			if (i !=a) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
			}
		hasil += i;
		i++;
		}
		System.out.print(hasil);
	}
}