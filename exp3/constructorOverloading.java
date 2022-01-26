import java.util.*;

public class constructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and height of the rectangle: ");
        double length = sc.nextDouble(), height = sc.nextDouble();
        shape rectangle = new shape(length, height);
        System.out.println("Perimeter of the rectangle is: " + rectangle.perimeter);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        shape circle = new shape(radius);
        System.out.println("Perimeter of the circle is: " + circle.perimeter);
    }
}

class shape {
    double perimeter;

    shape(double l, double h) {
        perimeter = l + h + l + h;
    }

    shape(double r) {
        perimeter = 6.28 * r;
    }
}