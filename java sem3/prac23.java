import java.util.LinkedList;

class ProducerConsumer {
    private final LinkedList<Integer> buffer;
    private final int capacity;

    public ProducerConsumer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }
                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait();
                }
                int consumedValue = buffer.removeFirst();
                System.out.println("Consumer consumed: " + consumedValue);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

public class prac23 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer(5);
        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}