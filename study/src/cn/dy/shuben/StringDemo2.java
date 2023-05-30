package cn.dy.shuben;

public class StringDemo2 {
    public static void main(String[] args) {

        //public boolean equals(Object  anObject):
         //  将此字符串与指定对象进行比较。由于我们比较的是字符串对象，所以参数直接传递一个字符串
        char []ch={'a','b','c'};
        //构造方法得到对象
        String s1=new String(ch);
        String s2=new String(ch);
        //直接赋值的方式得到对象
        String s3="abc";
        String s4="abc";
        //比较字符串对象地址是否相同
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println("-----------");
        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
