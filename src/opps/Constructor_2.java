package opps;

class Demo {
    int a;
    int b;

    Demo() {
        a = 8;
        b = 9;
    }

    public void display() {
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
    }
}

public class Constructor_2 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}