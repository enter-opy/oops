import java.util.*;

public class transpose {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int arr[][] = new int[20][20];

        System.out.println("Enter the number of rows and colums of the matrices: ");
        System.out.println("Number of rows: ");
        int r = obj.nextInt();
        System.out.println("Number of columns: ");
        int c = obj.nextInt();

        System.out.println("Enter the elements of the matrix: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        System.out.println("The transpose of the matrix is ");

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println("");
        }
    }
}