package opps;
class A
{
	int a, b;
	public void add()
	{
		int c=a+b;
		System.out.println("Addition"+ c);
	}
}
	class B extends A
	{
		public B(int a, int b) 
		{
			this.a=a;
			this.b=b;
		}
		public void substraction() {
			int c=a-b;
			System.out.println("Substraction"+ c);
		}
	}
	
public class Inheritance_Add
{
	public static void main(String[] args) 
	{
			B obj= new B(12,5);

			obj.add();
			obj.substraction();
	}

}
