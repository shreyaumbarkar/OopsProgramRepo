package opps;
class Student_Mtd
{
	int roll_no;
	String name;
	double per;
	public void getdata(int a, String b, double c)
	{
		roll_no=a;
		name=b;
		per=c;
	}
	public void putdata() {
	System.out.println(roll_no);
	System.out.println(name);
	System.out.println(per);
}
public class InitObj{
	public static void main (String args[])
	{
		Student_Mtd std=new Student_Mtd();
		std.getdata(99, "Shreya",56.9);
		std.putdata();
	}
}
}

	
