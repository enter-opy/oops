import java.util.*;

public class largestMatrixElm {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int arr[][] = new int[20][20];

        System.out.println("Enter the number of rows and colums in the square matrix: ");
        int n = obj.nextInt();

        System.out.println("Enter the elements of the matrix: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        int largest = arr[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }

        System.out.println("The largests elements of the matrix is " + largest);
    }
}