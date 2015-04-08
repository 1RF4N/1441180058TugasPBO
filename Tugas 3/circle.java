// nama kelas circle.java
public class circle
{

//variabel radius (double) dan color (string)
	private double radius;
	private String color;

//konstruktor untuk kelas circle -> nama kelas = nama function
	public circle()
	{
		radius 	= 1.0;
		color 	= "MeraMuda";
	}
	public circle(double r, String c)
	{
		radius = r;
		color = c;
	}
	public circle(String c)
	{
		radius = 2.5;
		color = c;
	}

	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r;
	}

	public String getColor()
	{
		return color;
	}
	public void setColor(String c)
	{
		color = c;
	}

	public double getArea()
	{
		return(radius*radius*Math.PI);
	}
}