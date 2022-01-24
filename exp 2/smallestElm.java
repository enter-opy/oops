import java.util.*;

public class smallestElm {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int arr[] = new int[20];

        System.out.println("Enter the number of elements in the array: ");
        int n = obj.nextInt();

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The smallest elements of the array is " + smallest);
    }
}