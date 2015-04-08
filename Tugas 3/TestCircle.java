class TestCircle {
	public static void main(String[] args) {
		
	
	circle cahya = new circle();
	circle ardi = new circle(30);
	circle bolank = new circle(96,"green");

	System.out.println("Radius = "+ cahya.getRadius()+" Color = "+ cahya.getColor() + " Luasnya = " + cahya.getArea());
	System.out.println("Radius = "+ ardi.getRadius()+" Color = "+ ardi.getColor() + " Luasnya = " + ardi.getArea());
	System.out.println("Radius = "+ bolank.getRadius()+" Color = "+ bolank.getColor() + " Luasnya = " + bolank.getArea());
	}

}
