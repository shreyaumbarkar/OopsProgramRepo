package opps;
class Main2
{
	int age;
	String name;
	Main2(int a, String n)
	{
		age=a;
		name=n;
		System.out.println("Student info");
		
	}
	void display()
	{
		System.out.println(age+" "+name);
	}
	
}

public class Parameterize_constructor{
	public static void main (String args[])
	{
		Main2 obj1=new Main2(19,"shreya");
		Main2 obj2= new Main2(29, "Shruti");
		obj1.display();
		obj2.display();
		
	}
}
