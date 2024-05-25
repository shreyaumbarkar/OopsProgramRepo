package opps;
class Students{
	private String name;
	private int age;
	public String display() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Encapsulation_ex {
	public static void main (String args[]) {
	Students st= new Students();
	st.setName("Shreya");
	st.setAge(20);
	System.out.println("Student Details:");
	System.out.println("Name:"+st.display());
	System.out.println("Age"+st.getAge());
	
}
}
