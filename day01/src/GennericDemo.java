import java.util.ArrayList;
import java.util.List;

public class GennericDemo {
    public static void main(String[] args) {
        //类型通配符：<?>
        //List<?>:表示元素类型未知的List的父类，它的元素可以匹配如何的类型
        //这种带着通配符List仅表示它各种泛型List的父类，并不能把元素添加到其中
        List<?> list1=new ArrayList<Object>();
        List<?> list2=new ArrayList<Number>();
        List<?> list3=new ArrayList<Integer>();
        System.out.println("------------");
        //- 类型通配符上限：<? extends 类型>
        //- List<? extend Number>:它表示的类型是Number或者其子类型
        List<? extends Number> list4= new ArrayList<Number>();
        List<? extends Number> list5= new ArrayList<Integer>();
        System.out.println("------------");
        //类型通配符下限：<? super 类型>
        List<? super Number> list6= new ArrayList<Object>();
        List<? super Number> list7= new ArrayList<Number>();

    }
}
