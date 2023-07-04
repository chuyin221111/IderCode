/**
 * @auther chuyin
 * @date 2023/7/4
 * @project java SE
 */
public class MyThreadDemo {
    public static void main(String[] args) {
      //Thread(String name)
        MyThread my1=new MyThread("zhangsna");

        MyThread my2=new MyThread("lisi");
       // my1.setName("zhangan");
        //my2.setName("lisi");

        my1.start();
        my2.start();

        //static Thread currentThread()返回对当前正在执行的线程对像的引用
       // System.out.println(Thread.currentThread().getName());
    }
}
