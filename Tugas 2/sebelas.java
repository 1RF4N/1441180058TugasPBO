public class sebelas
{
	public static void main(String[] args)
	{
		int x = 5, y=6;
		for (int i=0;i<x;i++)
		{
			if(i%2!=0)
			{
				System.out.print(" ");
			}
			System.out.print("#");
			for (int j=0;j<y;j++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}