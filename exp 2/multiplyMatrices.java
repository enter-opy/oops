import java.util.*;

public class multiplyMatrices {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int arr1[][] = new int[20][20], arr2[][] = new int[20][20], product[][] = new int[20][20];

        System.out.println("Enter the number of rows and colums of the 1st matrix: ");
        System.out.println("Number of rows: ");
        int r1 = obj.nextInt();
        System.out.println("Number of columns: ");
        int c1 = obj.nextInt();

        System.out.println("Enter the number of rows and colums of the 2nd matrix: ");
        System.out.println("Number of rows: ");
        int r2 = obj.nextInt();
        System.out.println("Number of columns: ");
        int c2 = obj.nextInt();

        if (c1 != r2) {
            System.out.println("Cannot multiply matrices");
            return;
        }

        System.out.println("Enter the elements of the 1st matrix: ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = obj.nextInt();
            }
        }

        System.out.println("Enter the elements of the 2nd matrix: ");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = obj.nextInt();
            }
        }

        int temp;

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                temp = 0;

                for (int k = 0; k < r2; k++) {
                    temp += arr1[i][k] * arr2[k][j];
                }

                product[i][j] = temp;
            }
        }

        System.out.println("The product of two matrices: ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
}