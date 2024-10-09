
import java.util.Random;

class RandomNumberGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                int randomNumber = random.nextInt(100); // Generate random number between 0 and 99
                System.out.println("Generated Number: " + randomNumber);
                if (randomNumber % 2 == 0) {
                    SecondThread.square(randomNumber);
                } else {
                    ThirdThread.cube(randomNumber);
                }
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SecondThread {
    static void square(int number) {
        System.out.println("Square: " + (number * number));
    }
}

class ThirdThread {
    static void cube(int number) {
        System.out.println("Cube: " + (number * number * number));
    }
}

public class prac24 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RandomNumberGenerator());
        t1.start();
    }
}