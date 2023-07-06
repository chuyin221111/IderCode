/**
 * @auther chuyin
 * @date 2023/7/6
 * @project java SE
 */
public class MyRunnable  implements Runnable {
    /**
     * MyRunnable
     *实现Runnable接口，并没有继承Thread,好处是将来可以有自己的父类，而继承Thread也只是为run方法
     */
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+","+i);
        }
    }
}
