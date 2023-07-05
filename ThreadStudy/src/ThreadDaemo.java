/**
 * @auther chuyin
 * @date 2023/7/5
 * @project java SE
 */
public class ThreadDaemo  extends  Thread{

    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(getName()+":"+i);
        }
    }
}
