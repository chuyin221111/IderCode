/**
 * @auther chuyin
 * @date 2023/7/13
 * @project java SE
 */
/*
1.奶箱类（Box）:定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
2.生产者类（Producer）：实现Runnable接口，重写run()方法，调用存储牛奶的操作
3.消费者类（Customer）：实现Runnable接口，重写run()方法，调用获取牛奶的操作
4.测试类（BoxDemo）：里面有main方法，main方法中的代码如下
A:创建奶箱对象，这是共享数据区域
B:创建生产者对象，把奶箱作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
C:创建消费者对象，把奶箱作为构造方法参数传递，因为在这个类中要获取存储牛奶的操作
D:创建2个线程对象，分别把生产者对象和消费者对像作为构造方法参数传递
E:启动线程
 */
public class Box {
    private int milk;
    private boolean state=false;

    public synchronized void put(int milk) throws InterruptedException {
        if(state)
        {
            wait();
        }
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶瓶");
        state=true;
        notifyAll();

    }
    public  synchronized void get()
    {  if(!state)
    {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        state=false;
        notifyAll();
    }
}
