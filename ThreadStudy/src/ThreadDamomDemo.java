/**
 * @auther chuyin
 * @date 2023/7/5
 * @project java SE
 */
public class ThreadDamomDemo {
    // void setDaemon(blooean on):将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
    public static void main(String[] args) {
        ThreadDaemo td1=new ThreadDaemo();
        ThreadDaemo td2=new ThreadDaemo();

        td1.setName("关羽");
        td2.setName("张飞");
        //设置主线程为刘备
        Thread.currentThread().setName("刘备");
        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);
        td1.start();
        td2.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);

        }

    }
}
