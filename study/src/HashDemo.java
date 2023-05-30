public class HashDemo {
    public static void main(String[] args) {
        Student01 s1=new Student01("张三",18);
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("-----------");
        //默认情况下，不同对象的哈希值是不相同的
        Student01 s2=new Student01("lisi",37);
        System.out.println(s2.hashCode());
    }
}
