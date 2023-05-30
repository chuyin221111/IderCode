package cn.dy.shuben;
/**public class Interlmpl extends Object  implements Inter（相当于下面这个）*/
public   class Interlmpl implements Inter {
    public Interlmpl() {
        super();         //此时调用的是Object，类Object是类层次结构的根。每个类都有Object作为超累。
    }

    @Override
    public void method() {
        System.out.println("想吃鱼");
    }

    @Override
    public void show() {
        System.out.println("睡觉");
    }
}