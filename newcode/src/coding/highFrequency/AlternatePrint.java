package coding.highFrequency;

public class AlternatePrint {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    System.out.println("线程" + Thread.currentThread().getName() + "的休眠被打断");
                }
            }
        });
        t1.start();
        t1.interrupt();
    }
}
