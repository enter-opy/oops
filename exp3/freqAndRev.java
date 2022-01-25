import java.util.*;

public class freqAndRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        functions fn = new functions();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to count frequency: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        fn.frequency(str, ch);
        fn.reverse(str);
    }
}

class functions {
    void frequency(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of " + ch + " in " + str + " is " + count);
    }

    void reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("The reversed string is: " + rev);
    }
}