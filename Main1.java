class Shape {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(int side) {
        return side * side;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Area of Circle: " + s.area(5));
        System.out.println("Area of Rectangle: " + s.area(4, 6));
        System.out.println("Area of Square: " + s.area(4));
    }
}