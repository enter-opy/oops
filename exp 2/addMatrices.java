import java.util.*;

public class addMatrices {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int arr1[][] = new int[20][20], arr2[][] = new int[20][20], sum[][] = new int[20][20];

        System.out.println("Enter the number of rows and colums of the matrices: ");
        System.out.println("Number of rows: ");
        int r = obj.nextInt();
        System.out.println("Number of columns: ");
        int c = obj.nextInt();

        System.out.println("Enter the elements of the 1st matrix: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = obj.nextInt();
            }
        }

        System.out.println("Enter the elements of the 2nd matrix: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("The sum of two matrices: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
}