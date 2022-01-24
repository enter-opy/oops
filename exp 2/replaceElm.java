import java.util.*;

public class replaceElm {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int arr[] = new int[20];

        System.out.println("Enter the number of elements in the array: ");
        int n = obj.nextInt();

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter the element to be replaced: ");
        int index = -1, element = obj.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Enter the element to replace: ");
        element = obj.nextInt();

        arr[index] = element;

        System.out.println("The elements of the array after replacing:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
