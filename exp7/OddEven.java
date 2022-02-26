class Odd extends Thread {
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}

class Even extends Thread {
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}

public class OddEven {
    public static void main(String[] args) {
        Odd odd = new Odd();
        Even even = new Even();

        odd.start();
        try {
            odd.join();
        } catch(Exception e) {}

        even.start();
    }
}
