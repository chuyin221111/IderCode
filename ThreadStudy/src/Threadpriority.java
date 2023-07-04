/**
 * @auther chuyin
 * @date 2023/7/4
 * @project java SE
 */
public class Threadpriority extends Thread{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(getName()+","+i);
        }
    }
}
