package opps;
class Students{
	String name;
	int roll_no;
	double per;
	public void pass(String a, int b, double c)
	{
		 name=a;
		roll_no=b;
		per=c;
	}
	public void display() {
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(per);
	}
}

public class InitObj {
	public static void main (String args[])
	{
		Students std=new Students();
		std.pass("Shreya",123, 87);
		std.display();
	}
}
