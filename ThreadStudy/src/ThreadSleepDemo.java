/**
 * @auther chuyin
 * @date 2023/7/5
 * @project java SE
 */
public class ThreadSleepDemo {
    //static void sleep(long mills):使当前正在执行的线程停留(暂停执行)指定的毫秒数
    public static void main(String[] args) {
        ThreadSleep t1=new ThreadSleep();
        ThreadSleep t2=new ThreadSleep();
        ThreadSleep t3=new ThreadSleep();
        t1.setName("张三");
        t2.setName("李四");
        t3.setName("王五");
        t1.start();
        t2.start();
        t3.start();
    }
}
