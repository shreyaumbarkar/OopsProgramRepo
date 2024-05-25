package opps;
class Main1
{
	int age;
	String name;
	Main1()
	{
		age=19;
		name="Shreya";
		System.out.println("Student info");
	}
	void display() 
	{
		
		System.out.println("age  " +age);
		System.out.println("name  " + name);
	}
}
public class Construct_ex {
	public static void main (String args[])
	{
		Main1 obj=new Main1();
		obj.display();
	}
}