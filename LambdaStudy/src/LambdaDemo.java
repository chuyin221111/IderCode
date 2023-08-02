/**
 * @auther chuyin
 * @date 2023/8/2
 * @project java SE
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程启动");

            }
        }).start();

         */
        //Lambda表达式的改进
        new Thread(()->{
            System.out.println("多线程启动");
        }).start();
    }
}
