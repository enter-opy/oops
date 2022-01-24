import java.util.*;

public class secondlargest {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.println("Enter the number of elements in the array: ");
        int n = obj.nextInt();

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        int largest = arr[0], secondlargest;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        if (arr[0] != largest) {
            secondlargest = arr[0];
        }
        else {
            secondlargest = arr[1];
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondlargest && arr[i] != largest) {
                largest = arr[i];
            }
        }

        System.out.println("The second largest elements of the array is " + secondlargest);
    }
}
