/**
 * @auther chuyin
 * @date 2023/8/6
 * @project java SE
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
       //必须有上下环境，才能推导出Lambda对应的接口
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("匿名内部类");
           }
       }).start();
       Runnable r=()-> System.out.println("Lambda表达式");
       new Thread(r).start();

       new Thread(()-> System.out.println("lambda表达式")).start();
    }
    private static void useInter(Inter r)
    {
        r.print();
    }
}
