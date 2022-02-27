import java.util.Random;

class Square extends Thread {
    int square;

    Square(int root) {
        this.square = root * root;
    }

    public void run() {
        System.out.println((this.square));
    }
}

class Cube extends Thread {
    int cube;

    Cube(int root) {
        this.cube = root * root * root;
    }

    public void run() {
        System.out.println((this.cube));
    }
}

class RandomInteger extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randInt = random.nextInt(100);

            if (randInt  % 2 == 0) {
                Square square = new Square(randInt);
                square.start();
            } else {
                Cube cube = new Cube(randInt);
                cube.start();
            }
    
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }    
    } 
}

public class MultiThread {
    public static void main(String[] args) {
        RandomInteger randomInteger = new RandomInteger();
        randomInteger.start();
    }
}