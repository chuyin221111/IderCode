/**
 * @auther chuyin
 * @date 2023/7/4
 * @project java SE
 */
public class MyThread extends Thread {
    public MyThread(){}
    public MyThread(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(getName()+","+i);
        }
    }

}
