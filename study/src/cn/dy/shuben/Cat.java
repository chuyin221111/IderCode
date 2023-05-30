package cn.dy.shuben;

public class Cat  extends Animal{
    public int age=20;
    public int weight=10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playgame()
    {
        System.out.println("猫捉迷藏");
    }
}
