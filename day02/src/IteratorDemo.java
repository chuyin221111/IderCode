import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();
        /*
         public Iterator<E> iterator(){
               return new Itr();
    }
       private class Itr implements Iterator<E>{
       }

      */
        //E next():返回迭代中的下一个元素
       /* System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
        //NoSuchElementException表示被请求的元素不存在
       // System.out.println(it.next());
        /*boolean hasNext ():如果迭代具有更多元素，则返回 true
        **/
        if(it.hasNext())
        {
            System.out.println(it.next());
        }
        if(it.hasNext())
        {
            System.out.println(it.next());
        }
        if(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
