/**
 * @auther chuyin
 * @date 2023/7/6
 * @project java SE
 */
public class MyRunnableDemo{
    public static void main(String[] args) {
        MyRunnable my=new MyRunnable();
        /**
         * 可以把MyRunnable类的对象看作同一个资源，有多个线程（t1,t2）去使用
         */
        //Thread （Runnable target）
        //Thread ti1=new Thread(my);
        //Thread(Runnable target,String name)
        Thread t1=new Thread(my,"高铁");
        Thread t2=new Thread(my,"飞机");
        t1.start();
        t2.start();
    }
}
