import java.util.*;

public class studentClass {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        student s = new student();

        System.out.print("Enter name: ");
        String name = obj.nextLine();

        System.out.print("Enter roll no: ");
        int rollno = obj.nextInt(), marks[] = new int[5];

        System.out.println("Enter the marks: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = obj.nextInt();
        }

        s.read(name, rollno, marks);
        s.display();
    }
}

class student {
    String name;
    int rollno, marks[] = new int[5];

    void read(String n ,int r, int[] m) {
        name = n;
        rollno = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Marks: " + marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);
    }
}