/**
 * @auther chuyin
 * @date 2023/8/5
 * @project java SE
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用useFlyable
        //匿名内部类
        useFilable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("-------------------");
        //Lambda
        useFilable((String s)->{
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

    }
    private  static void useFilable(Flyable f)
    {
        f.fly("风和日丽，晴空万里");
    }
}
