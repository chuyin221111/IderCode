/**
 * @auther chuyin
 * @date 2023/7/7
 * @project java SE
 */
public class SellTickeDemo {
    public static void main(String[] args) {
      SellTiicke st=new SellTiicke();
        Thread t1=new Thread(st,"窗口1");
        Thread t2=new Thread(st,"窗口2");
        Thread t3=new Thread(st,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }

}
