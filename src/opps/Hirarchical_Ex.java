package opps;
class P
{
	int x;
	int y;
	void get(int a, int b)
	{
		x=a;
		y=b;
	}
}
class z extends P
{
	void add()
	{
		int v= x+y;
		System.out.println("Addition " + v);
	}
}
class D extends P
{
	void display()
	{
	int z=x-y;
	System.out.println("Substraction " +z);
}
}
public class Hirarchical_Ex {

	public static void main(String[] args) {
		D obj=new D();
		obj.get(8,6);
		obj.display();
		z ob=new z();
		ob.add();
		
	}

}
