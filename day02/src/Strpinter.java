import java.util.Scanner;

public class Strpinter {
    public static void main(String[] args) {
        char[] ch={'e','f','d','g','p','a','z'};
        String s1=new String(ch);
        int index;
        String s2=new String("fuehfk");
        String s3="student";
        //按照字典来比较
        System.out.println(s1.compareTo(s2));
        //忽略大小写
        System.out.println( s1.compareToIgnoreCase(s2));
        //将给定的字符串连接到这个字符串的末尾
        System.out.println( s1.concat(s3));
        System.out.println("输入索引处");
        Scanner in=new Scanner(System.in);
        index=in.nextInt();
        //获取给定的Index处的字符
        System.out.println(s1.charAt(index));
        //产生这个字符串中出现给定字符的第一个位置的索引;
        System.out.println(s1.indexOf('d'));
        //从给定的索引处开始，产生了这个字符串中出现给定的字符串的第一个位置
        System.out.println(s1.indexOf("az",1));
        //产生这个字符串出现给定子字符的第一个位置的索引
        System.out.println(s1.indexOf("dg"));
        //从给定的索引处开始，产生这个字符串中出现给定子字符的第一个位置的索引;
        System.out.println(s1.indexOf('z',2));
        //产生这个字符串的长度;
        System.out.println(s1.length());
        //通过将这个字符串中的oldChar字符转换为newChar字符来创建一个新字符串;
        System.out.println(s1.replace('f','j'));
        //检查这个字符串是否以给定的前缀开头;
        System.out.println(s1.startsWith("ef"));
        //产生一个新字符串，它是这个字符串的子字符串;
        System.out.println(s1.substring(3));
        //去掉字符串开头和结尾的空格;
        System.out.println(s1.trim());






    }


}
