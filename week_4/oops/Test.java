package week_4.oops;

interface Square {
    int square(int x);
}

class Arithmetic implements Square {
    public int square(int x) {
        return x * x;
    }
}

public class Test {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        System.out.println("Square: " + obj.square(5));
    }
}