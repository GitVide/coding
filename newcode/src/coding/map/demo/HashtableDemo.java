package coding.map.demo;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class HashtableDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashtable = new Hashtable<>();
        new CountDownLatch(2);
        new Semaphore(3);

    }

}
