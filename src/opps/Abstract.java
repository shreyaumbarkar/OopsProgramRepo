package opps;
abstract class Bike
{
	Bike()
	{
		System.out.println("bike is created");
	}
	abstract void run();// abstract method 
	void changeGear()//non abstract method because abstract class contain abstract and non abstract method
	{
		System.out.println("Gear changed");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Bike obj=new Honda();
		obj.run();
		obj.changeGear();

	}

}
