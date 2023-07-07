/**
 * @auther chuyin
 * @date 2023/7/7
 * @project java SE
 */
public class SellTiicke implements Runnable{
    private int ticke=100;
    Object obj=new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticke > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售" + ticke + "张票");
                    ticke--;
                }
            }
        }
    }
}
