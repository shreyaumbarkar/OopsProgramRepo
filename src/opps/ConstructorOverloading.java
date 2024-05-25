package opps;
 class Student
{
	int rollno;
	String name;
	Student()
	{
		System.out.println("This is default constructor");
	}
	Student(int i, String n)
	{
		rollno=i;
		name=n;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Student obj= new Student();
		System.out.println("Default constructor");
		System.out.println("Srudent rollno "+ obj.rollno + "/n Student name " + obj.name);
		System.out.println("Parametarize constructor");
		Student st= new Student(108, "Shreya");
		System.out.println("Student rollno " + st.rollno + "/n Student name " + obj.name);
	}

}
