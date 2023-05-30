package cn.dy.shuben;

public class AnimalDemo {
    /**向上转型
     从子到父
     父类引用指向子类对象
     */
    /**向下转型
     * 从父到子
     * 父类引用转为子类对象
     * @param args
     */
    public static void main(String[] args) {
        //多态
        //向上转型
        Animal a=new Cat();
        System.out.println(a.age);
       // System.out.println(a.weight);
        a.eat();
       // a.playgame();
        //向下转型
        Cat c=(Cat)a;
        c.eat();
        c.playgame();
    }
}
