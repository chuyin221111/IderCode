import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> l=new LinkedHashSet<String>();
        l.add("java");
        l.add("world");
        l.add("java");
        l.add("hel");
        for(String s:l)
        {
            System.out.println(s);
        }
    }
}
