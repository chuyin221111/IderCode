

/**
 * @auther chuyin
 * @date 2023/7/13
 * @project java SE
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b=new Box();
        Producer p=new Producer(b);
        Customer c=new Customer(b);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
    }
}
