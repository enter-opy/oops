import java.util.*;

public class concatinate {
    public static void main(String[] args) {
        methods obj = new methods();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to concatinate: ");
        System.out.print("Number 1: ");
        int x1 = sc.nextInt();
        System.out.print("Number 2: ");
        int x2 = sc.nextInt();
        obj.concatinate(x1, x2);

        System.out.println("Enter two strings to concatinate: ");
        System.out.print("String 1: ");
        sc.nextLine();
        String str1 = sc.nextLine();
        System.out.print("String 2: ");
        String str2 = sc.nextLine();
        obj.concatinate(str1, str2);
    }
}

class methods {
    void concatinate(int x1, int x2) {
        int i, copy = x2;
        for(i = 0; copy != 0; i++) {
            copy /= 10;
        }

        int y = x1 * (int) Math.pow(10, i) + x2;

        System.out.println("The concatinated number is: " + y);
    }

    void concatinate(String str1, String str2) {
        String str = str1 + str2;

        System.out.println("The concatinated string is: " + str);
    }
}