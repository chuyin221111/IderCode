/**
 * @auther chuyin
 * @date 2023/7/13
 * @project java SE
 */
public class Customer implements  Runnable{
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }
    public void run()
    {
        while(true)
        {
            b.get();
        }
    }
}
