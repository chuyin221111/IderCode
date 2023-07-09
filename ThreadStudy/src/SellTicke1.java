import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther chuyin
 * @date 2023/7/9
 * @project java SE
 */
public class SellTicke1 implements Runnable {
    private int ticke = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticke > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售" + ticke + "张票");
                    ticke--;

                }
            } finally {
                lock.unlock();
            }

        }
    }
}
