import java.util.*;

public class sumofArray {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int arr[] = new int[20];

        System.out.println("Enter the number of elements in the array: ");
        int n = obj.nextInt();

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the elements of the array = " + sum);
    }
}
