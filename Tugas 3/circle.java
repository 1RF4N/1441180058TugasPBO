class circle {
	
	private double radius; //Information Hiding
	private String color;

	public circle(){

		radius = 1.0;
		color = "blue";

	}

	public circle(double a){ //Konstruktor yang bisa mengubah Radius

		radius = a;
		color = "blue";

	}

	public circle(double a, String b){ 

		radius = a;
		color = b;
	}

	public double getRadius(){ //Getter

		return radius;
	}

	public String getColor(){

		return color;

	}

	public double setRadius(double r){ //Setter

		return radius = r;
	}

	public String setColor(String c){

		return color = c;

	}

	public double getArea(){

		return radius*radius*Math.PI;
	}
}
