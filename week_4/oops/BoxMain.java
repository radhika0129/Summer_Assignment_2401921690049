package week_4.oops;

class Box {

    double length, breadth;

    Box(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    double height;

    Box3D(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class BoxMain {
    public static void main(String[] args) {
        Box3D b = new Box3D(10, 5, 2);

        System.out.println("Area: " + b.area());
        System.out.println("Volume: " + b.volume());
    }
}