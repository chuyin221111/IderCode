package cn.dy.shuben;

public class Student {
    String name;
    public Student()
    {
        System.out.println("构造方法");
    }
    public Student(String name)
    {
        System.out.println("这是一个有参数的构造方法");
    }
    {
        System.out.println("构造代码块");
    }
    static
    {
        System.out.println("静态代码块");
    }
}
