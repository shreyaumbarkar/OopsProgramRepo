package opps;
class A1
{
	int a;
	void add(int x)
	{
		a=x;
	}
}
 class B1 extends A1
 {
	 int b;
	 void accept(int y)
	 {
		 b=y;
	 }
 }
 class c extends B1{
	 void display() {
		 int c=a+b;
		 System.out.println("Addition " +c);
 }
 }
public class MultiLevelInheritence {

	public static void main(String[] args) {
		c st=new c();
		st.accept(32);
		st.add(54);
		st.display();
	}

}
