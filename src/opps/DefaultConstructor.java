package opps;

class Constructor {
    Constructor() {
        int a = 12;
        int b = 34;
        int c = a + b;
        System.out.println(c);
    }

    Constructor(int x, int y) { // Parameterized constructor
        int c = x + y;
        System.out.println(c);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Constructor ct = new Constructor(); // Using default constructor
        Constructor ct2 = new Constructor(10, 20); // Using parameterized constructor
    }
}