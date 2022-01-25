import java.util.*;

public class factorialAndSumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        factorialAndSumofdigits obj = new factorialAndSumofdigits();

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        obj.factorial(n);
        obj.sumofDigits(n);
    }

    void factorial(int n) {
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
                  
    void sumofDigits(int n) {
        int sum = 0, copy = n;
        
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits of " + copy + " is " + sum);
    }
}