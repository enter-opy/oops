class Bank {
    int balance = 1000;

    synchronized void withdraw(int cash) {
        try {
            wait();
        } catch(Exception e) {}

        this.balance -= cash;
        System.out.println("Cash wihdrawn\nBalance: " + balance);
    }

    void deposit(int cash) {
        synchronized(this) {
            this.balance += cash;
            System.out.println("Cash deposited\nBalance: " + balance);
            notify();
        }
    }
}

class Withdraw extends Thread {
    Bank bank;

    Withdraw(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        bank.withdraw(1500);;
    }
}

class Deposit extends Thread {
    Bank bank;

    Deposit(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        bank.deposit(2000);;
    }
}

public class BankingEnvironment {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Withdraw withdraw = new Withdraw(bank);
        Deposit deposit = new Deposit(bank);

        withdraw.start();
        deposit.start();
    }
}
