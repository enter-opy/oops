class Employee {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary of " + this.name + " is " + this.salary);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Officer officer = new Officer("Matthew McConaughey", 30, "9090909090", "AC Road", 20000.0);

        Manager manager = new Manager("Bronco Henry", 35, "9090909091", "MG Road", 200000.0);

        officer.printSalary();
        System.out.println("Age: " + officer.age + "\nPhone: " + officer.phone + "\nAddress: " + officer.address + "\n");

        manager.printSalary();
        System.out.println("Age: " + manager.age + "\nPhone: " + manager.phone + "\nAddress: " + manager.address + "\n");
    }
}