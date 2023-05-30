import java.util.ArrayList;

public class ArraysDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("java");
        array.add("world");
       // System.out.println(array.remove("world"));
        // System.out.println(array.remove("javaee"));
       // System.out.println(array.remove(1));
        // IndexOutOfBoundsException
       //System.out.println(array.remove(3));
        //System.out.println(array.set(1,"world"));
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        //IndexOutOfBoundsException
      //  System.out.println(array.get(3));

        System.out.println(array.size());
        //遍历集合的通用格式
        for (int i = 0; i < array.size(); i++) {
            String s=array.get(i);
            System.out.println(s);
        }
        System.out.println("array:"+array);
    }
}