
package opps;

final class Bike {
    class Honda1 {
        void run() {
            System.out.println("Running safely with 100kmph");
        }
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike.Honda1 honda = bike.new Honda1(); // Create instance of inner class using outer class instance
        honda.run();
    }
}