package opps;
class A{
	int a;
	int b;
	void add(int x, int y)
	{
		 a=x;
		 b=y;
		
	}
}
class B extends A
{
	void  display() 
	{
		int c=a+b;
		System.out.println("Addition   " + c);
	}
	
}
public class Inheritance_Ex {

	public static void main(String[] args)
	{
		B st=new B();
		st.add(23, 34);
		st.display();

	}

}
