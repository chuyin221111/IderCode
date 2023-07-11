import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @auther chuyin
 * @date 2023/7/11
 * @project java SE
 */
public class ListDemo {
    public static void main(String [] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("zhang");
        list.add("world");
        list.add("java");
        //通过list集合的listIterator()方法得到
        ListIterator<String> lit=list.listIterator();
        while(lit.hasNext())
        {
            String s=lit.next();
            System.out.println(s);
        }
        System.out.println("-----------");
        while(lit.hasPrevious())
        {
            String s= lit.previous();
            System.out.println(s);
        }
    }
}
