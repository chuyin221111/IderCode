/**
 * @auther chuyin
 * @date 2023/8/3
 * @project java SE
 */
/*
  练习1：
  1：定义一个接口（Eatable），里面定义一个抽象方法，void eat（）；
  2：定义一个测试类（EatableDemo），在测试中提供两个方法
   一个方法是：useEatable(Eatable e)
   一个方法是主方法，在主方法中调用useEatable方法
 */
public class EatableDemo {
    public static void main(String[] args) {
    Eatable e=new Eatablelmp();
     useEatable(e);
     //匿名内部类
        useEatable(new Eatable()
        {
            public  void eat()
            {
                System.out.println("一天一苹果，医生远离我");
            }
        });
        //lambda表达式
        useEatable(()->{
            System.out.println("一天一苹果，医生远离我");
        });
    }
    private static void useEatable(Eatable e)
    {
     e.eat();
    }
}
