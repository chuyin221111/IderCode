/**
 * @auther chuyin
 * @date 2023/7/9
 * @project java SE
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        SellTicke1 st=new SellTicke1();
        Thread t1=new Thread(st,"窗口1");
        Thread t2=new Thread(st,"窗口2");
        Thread t3=new Thread(st,"窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
