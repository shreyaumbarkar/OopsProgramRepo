package opps;

class Demo {
    public int sum(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int div(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}