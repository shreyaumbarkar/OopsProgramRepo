package opps;
interface Add {
    int add(int num1, int num2);
}
class Calculate implements Add {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
public class Abstraction_ex  {
    public static void main(String[] args) {
    	Calculate cal= new Calculate();
    	int CalAdd=cal.add(34, 87);
    	System.out.println("Addition of two number " + CalAdd);
        
    }
}
