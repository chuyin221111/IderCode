import java.util.Arrays;
import java.util.List;

public class Args {
    public static void main(String[] args) {
        //public static <T>List<T> asList(T... a):返回由指定数组支持的固定大小的列表
       List<String> list= Arrays.asList("hello","world","java");
       // list.add("javase");UnsupportedOperationException不支持该操作
        //list.remove("world");UnsupportedOperationException
        list.set(1,"javaee");
       System.out.println(list);


        //List接口有一个静态方法：
        //- public static<E> List<E> of(E...Eelements):返回包含任意数量元素的不可变列表
        //- 返回的集合不能做增删改操作
        //List<String> list=List.of("hello","world","java");jdk8没有,要jdk8以上才有
        //List.add("javaee");UnsupportedOperationException
        //List.remove("java");UnsupportedOperationException
        // List.set(1,"javaee");UnsupportedOperationException


        //Set<String> set=Set.of("hello","world","java","world");//IllegalArgumentException非法不正确的参数，因为Set不可有重复元素
       // Set<String> set=Set.of("hello","world","java");jdk8没有,要jdk8以上才有
       // set.add("javaee");UnsupportedOperationException
        //set.remove("world");UnsupportedOperationException

    }
}
