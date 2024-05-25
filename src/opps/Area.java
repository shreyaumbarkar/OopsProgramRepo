package opps;
interface Area1
{
	double compute(double a, double b);
}
class Rectangle implements Area1
{
	public double compute(double l,double b)
	{
		return (l*b);
	}
}
class Tringle implements Area1
{
	public double compute(double b, double h)
	{
		return(b*h/2);
	}
}
public class Area {

	public static void main(String[] args)
	{
		Rectangle rect=new Rectangle();
		double RArea=rect.compute(12, 67);
		System.out.println("The area of rectangle is " + RArea);
		Tringle tri= new Tringle();
		double TArea=tri.compute(34,78);
		System.out.println("Area of tringle is " + TArea);
		

	}

}
