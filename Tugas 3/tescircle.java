class tescircle
{
	public static void main(String[] args)
	{
//instansiasi objek
//namaClass namaObjek = namaKonstruktor
	circle bolank = new circle();
	//circle asolole = new circle(30,"HitamMuda");
	//circle radit = new circle("HijauLangit");

	bolank.setColor("green");
		
	System.out.println("Radius="+ bolank.getRadius() +" Color="+bolank.getColor() +" Luas="+bolank.getArea());
	//System.out.println("Radius="+ asolole.radius +" Color="+asolole.color +" Luas="+asolole.getArea());
	//System.out.println("Radius="+ radit.radius +" Color="+radit.color +" Luas="+radit.getArea());
	}
}