import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c=new ArrayList<String>();
        //boolean  add(E e):添加元素
       // System.out.println(c.add("hello"));
        //System.out.println(c.add("world"));
        //输出集合对象
        //System.out.println(c);
        c.add("hellow");
        c.add("world");
        c.add("java");
        //Boolean remove （Object 0）：从集合中移除指定的元素
        //System.out.println(c.remove("world"));
        //System.out.println(c.remove("java"));
        //void clear():清空集合中的元素
        // c.clear();
        //boolean contains(Object o):判断集合中是否存在指定的元素
        System.out.println(c.contains("java"));
        //输出集合对象
       // System.out.println(c);
        //boolean isEmpty():判断集合是否为空
        System.out.println(c.isEmpty());
        //int size():集合的长度，也就是集合中的元素
        System.out.println(c.size());

    }
}
