import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException() {    
        super("Low Balance");  
    }  
}

public class CustomException {
    public static void main(String[] args) throws LowBalanceException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank account balance: ");
        int balance = sc.nextInt();

        if (balance < 500) {
            throw new LowBalanceException();
        } else {
            System.out.println("All good");
        }
    }
}