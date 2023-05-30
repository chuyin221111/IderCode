import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("zhang");
        list.add("world");
        list.add("java");

        ListIterator<String> lit=list.listIterator();
        while(lit.hasNext())
        {
            String s=lit.next();
            if(s.equals("world"))
            {
                lit.add("javaee");
            }
        }
        System.out.println(list);

    }
}
