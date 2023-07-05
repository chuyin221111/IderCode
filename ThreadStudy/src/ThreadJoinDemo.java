/**
 * @auther chuyin
 * @date 2023/7/5
 * @project java SE
 */
public class ThreadJoinDemo {
    public static void main(String[] args)  {
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();
        t1.setName("康熙");
        t2.setName("四阿哥");
        t3.setName("八阿哥");

        t1.start();
        try {
            //void join（）：等待线程死·亡
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();

    }
}
