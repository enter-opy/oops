class Employee {
    void display() {
        System.out.println("Name of class is Employee.");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    void display() {
        super.display();
        System.out.println("Name of class is Engineer.");
    }

    void calcSalary() {
        super.calcSalary();
        System.out.println("Salary of employee is 20000");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.display();
        engineer.calcSalary();
    }
}
