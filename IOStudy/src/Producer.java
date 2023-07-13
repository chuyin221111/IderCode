/**
 * @auther chuyin
 * @date 2023/7/13
 * @project java SE
 */
public class Producer implements Runnable{
    private Box b;
    public Producer(Box b)
    {
        this.b=b;
    }
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try {
                b.put(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
