/**
 * @auther chuyin
 * @date 2023/7/4
 * @project java SE
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Threadpriority tp1=new Threadpriority();
        Threadpriority tp2=new Threadpriority();
        Threadpriority tp3=new Threadpriority();
        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");
      /*  System.out.println(tp1.getPriority());  //5
        System.out.println(tp2.getPriority());  //5
        System.out.println(tp3.getPriority());   //5

       */
      /* System.out.println(Thread.MAX_PRIORITY); //10
        System.out.println(Thread.MIN_PRIORITY);  //1
        System.out.println(Thread.NORM_PRIORITY);    //5

       */
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);
        tp1.start();
        tp2.start();
        tp3.start();



    }
}
