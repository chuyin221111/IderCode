/**
 * @auther chuyin
 * @date 2023/7/7
 * @project java SE
 */
public class SellTiicke implements Runnable {
    private static  int ticke = 100;
    private int x = 0;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (SellTiicke.class) {
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
            }else {
                /*synchronized (obj) {
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

                 */
         sellticke();
            }
            x++;
        }
    }
    //静态方法
    private static synchronized void sellticke()
    {

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
