public class TestRobot
{
	public static void main(String[] args)
	{
		Asimo unit = new Asimo(30, 150, 1000, 5);
		unit.CetakSpesifikasi();
		unit.Upgrade(20);
		unit.Upgrade(25);
	}
}