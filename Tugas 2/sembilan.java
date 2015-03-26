public class sembilan {
	public static void main(String[] args) {
		int x = 110;
		for (int i=1;i<x;i++) {
			if (i%5==0)
			{
				i++;
				System.out.print("JONI ");
			}
			System.out.print(i+" ");
			if (i%11==0)
			{
				System.out.println("");
			}
		}
	}
}