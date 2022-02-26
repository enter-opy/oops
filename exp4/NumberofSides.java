abstract class Shape {
    abstract void numberofSides();
}

class Rectangle extends Shape {
    void numberofSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shape {
    void numberofSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    void numberofSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class NumberofSides {
    public static void main(String[] args) {
        new Rectangle().numberofSides();
        new Triangle().numberofSides();
        new Hexagon().numberofSides();
    }
}
