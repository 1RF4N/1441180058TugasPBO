public class tujuh {
	public static void main(String[] args) {
		float a=10;
		float hasil=0;
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
		System.out.print(hasil / a);
	}
}