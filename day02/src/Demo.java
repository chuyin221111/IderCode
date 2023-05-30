import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<String> ha = new HashSet<String>();
        ha.add("hellow");
        ha.add("woe");
        ha.add("java");
        for(String i:ha)
        {
            System.out.println(i);
        }
    }
}
