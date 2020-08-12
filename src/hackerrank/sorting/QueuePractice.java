package hackerrank.sorting;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueuePractice {

    static class Pair<T,S> {
        public T value1;
        public S value2;

        public Pair(T value1, S value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }

    public static void main(String[] args) {
        tryPriorityQueue();


    }

    public static void tryPriorityQueue() {
        final PriorityQueue<Pair<String, Integer>>  pq = new PriorityQueue<>();
        Comparator<Pair<String, Integer>> comparator = new Comparator<Pair<String, Integer>>() {
            @Override
            public int compare(Pair<String, Integer> pair, Pair<String, Integer> t1) {

                return pair.value1.compareTo(t1.value1);
            }
        };

        Pair p1 = new Pair("Apple",5);
        Pair p2 = new Pair("Banana",5);

        System.out.println(comparator.compare(p1,p2));

        System.out.println("Apple".compareTo("Banana"));

        final PriorityQueue<String> spq = new PriorityQueue<String>();
        spq.add("Apple");
        spq.add("Zebra");
        spq.add("Banana");

        System.out.printf(spq.remove());
        System.out.printf(spq.remove());
        System.out.printf(spq.remove());

    }

    public static void tryBlockingQueue() {

        final BlockingQueue<String> q = new ArrayBlockingQueue<String>(5);

        Thread t1 = new Thread(() -> {
            while (true) {
                try {
                    q.put("asd");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1 Added from queue");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                try {
                    q.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T2 Removed from queue");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }
}
