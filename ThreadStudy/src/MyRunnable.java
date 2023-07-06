/**
 * @auther chuyin
 * @date 2023/7/6
 * @project java SE
 */
public class MyRunnable  implements Runnable {
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+","+i);
        }
    }
}
